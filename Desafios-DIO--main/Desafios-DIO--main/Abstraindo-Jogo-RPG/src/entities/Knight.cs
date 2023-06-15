using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Abstraindo_Jogo_RPG.src.entities
{
    public class Knight : Hero
    {
        public Knight(string Name, int Level, string HeroType){
            this.Name = Name;
            this.Level = Level;
            this.HeroType = HeroType;

        }
        public string Attack(){
           return this.Name + " Atacou com sua espada!";
        }
    }
}