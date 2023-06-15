using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Abstraindo_Jogo_RPG.src.entities
{
    public class Wizard : Hero
    {
        public Wizard(string Name, int Level, string HeroType){
            this.Name = Name;
            this.Level = Level;
            this.HeroType = HeroType;

        }

        public string Attack(){
           return this.Name + " Lançou magia!";
        } 
        public string Attack(int Bonus){

            if (Bonus > 6){
                return this.Name + " Lançou magia super efetiva com bonus de " + Bonus;
                
            } else {
                return this.Name + "Lançou magia com força fraca com bonus de " + Bonus;
            }

            
        }  
    }
}