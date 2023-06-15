using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Abstraindo_Jogo_RPG.src.entities
{
    public abstract class Hero
    {
         public Hero(string Name, int Level, string HeroType){
            this.Name = Name;
            this.Level = Level;
            this.HeroType = HeroType;
    }

    public Hero(){}
        public string Name =" ";
        public int Level = 0;
        public string HeroType =" ";

      

    public override string ToString(){
        return this.Name;
        }
    }
}