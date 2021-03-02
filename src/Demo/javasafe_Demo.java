// namespace Macroresolute.RSACryptoService
// 2     {
// 3         public static class RSACrypto
// 4         {
// 5             private static readonly Encoding Encoder = Encoding.UTF8;
// 6 
// 7             public static String Encrypt(this String plaintext)
// 8             {
// 9                 X509Certificate2 _X509Certificate2 = RSACrypto.RetrieveX509Certificate();
//10                 using (RSACryptoServiceProvider RSACryptography = _X509Certificate2.PublicKey.Key as RSACryptoServiceProvider)
//11                 {
//12                     Byte[] PlaintextData = RSACrypto.Encoder.GetBytes(plaintext);
//13                     int MaxBlockSize = RSACryptography.KeySize / 8 - 11;    //加密块最大长度限制
//14 
//15                     if (PlaintextData.Length <= MaxBlockSize)
//16                         return Convert.ToBase64String(RSACryptography.Encrypt(PlaintextData, false));
//17 
//18                     using (MemoryStream PlaiStream = new MemoryStream(PlaintextData))
//19                     using (MemoryStream CrypStream = new MemoryStream())
//20                     {
//21                         Byte[] Buffer = new Byte[MaxBlockSize];
//22                         int BlockSize = PlaiStream.Read(Buffer, 0, MaxBlockSize);
//23 
//24                         while (BlockSize > 0)
//25                         {
//26                             Byte[] ToEncrypt = new Byte[BlockSize];
//27                             Array.Copy(Buffer, 0, ToEncrypt, 0, BlockSize);
//28 
//29                             Byte[] Cryptograph = RSACryptography.Encrypt(ToEncrypt, false);
//30                             CrypStream.Write(Cryptograph, 0, Cryptograph.Length);
//31 
//32                             BlockSize = PlaiStream.Read(Buffer, 0, MaxBlockSize);
//33                         }
//34 
//35                         return Convert.ToBase64String(CrypStream.ToArray(), Base64FormattingOptions.None);
//36                     }
//37                 }
//38             }
//39 
//40             public static String Decrypt(this String ciphertext)
//41             {
//42                 X509Certificate2 _X509Certificate2 = RSACrypto.RetrieveX509Certificate();
//43                 using (RSACryptoServiceProvider RSACryptography = _X509Certificate2.PrivateKey as RSACryptoServiceProvider)
//44                 {
//45                     Byte[] CiphertextData = Convert.FromBase64String(ciphertext);
//46                     int MaxBlockSize = RSACryptography.KeySize / 8;    //解密块最大长度限制
//47 
//48                     if (CiphertextData.Length <= MaxBlockSize)
//49                         return RSACrypto.Encoder.GetString(RSACryptography.Decrypt(CiphertextData, false));
//50 
//51                     using (MemoryStream CrypStream = new MemoryStream(CiphertextData))
//52                     using (MemoryStream PlaiStream = new MemoryStream())
//53                     {
//54                         Byte[] Buffer = new Byte[MaxBlockSize];
//55                         int BlockSize = CrypStream.Read(Buffer, 0, MaxBlockSize);
//56 
//57                         while (BlockSize > 0)
//58                         {
//59                             Byte[] ToDecrypt = new Byte[BlockSize];
//60                             Array.Copy(Buffer, 0, ToDecrypt, 0, BlockSize);
//61 
//62                             Byte[] Plaintext = RSACryptography.Decrypt(ToDecrypt, false);
//63                             PlaiStream.Write(Plaintext, 0, Plaintext.Length);
//64 
//65                             BlockSize = CrypStream.Read(Buffer, 0, MaxBlockSize);
//66                         }
//67 
//68                         return RSACrypto.Encoder.GetString(PlaiStream.ToArray());
//69                     }
//70                 }
//71             }
//72 
//73             private static X509Certificate2 RetrieveX509Certificate()
//74             {
//75                 return null;    //检索用于 RSA 加密的 X509Certificate2 证书
//76             }
//77         }
//78     }