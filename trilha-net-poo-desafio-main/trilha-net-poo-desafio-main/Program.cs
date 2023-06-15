using DesafioPOO.Models;

// TODO: Realizar os testes com as classes Nokia e Iphone
Console.WriteLine("Smartphone Nokia: ");
Smartphone Nokia = new Nokia(numero: "20224578", modelo: "Nokia2510", imei: "nk2546789", memoria: 32);
Nokia.Ligar();
Nokia.ReceberLigacao();
Nokia.InstalarAplicativo("Linkedin");

Console.WriteLine("\n");

Console.WriteLine("Smartphone Iphone: ");
Smartphone Iphone = new Iphone(numero: "1007845", modelo: "IphoneBlue", imei: "IP457896", memoria: 128);
Iphone.Ligar();
Iphone.ReceberLigacao();
Iphone.InstalarAplicativo("Facebook");

