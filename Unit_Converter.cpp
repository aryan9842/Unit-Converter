#include<iostream>
#include<math.h>
using namespace std;
class input{
public:
int n;
float in, m, cm, f, yd, mile, km, acre, pc, msq, h,s, speed, oz, g, lb, kg, atm, pa, mmHg, hp, kw, F, C, cal, J, wrong, select;
void intro(){
cout<<"<----------------------Mathematical Unit Conversion--------------------->"<<endl;
cout<<"<-------------There are total 30 unit conversion in this project------------->"<<endl<<endl;
cout<<"No.   Unit\t\t\t\t";cout<<"No.   Unit"<<endl<<endl;
cout<<" 1.   in -> cm\t\t\t\t";cout<<"16.   m/s -> km/h"<<endl;
cout<<" 2.   cm -> in\t\t\t\t";cout<<"17.   oz -> g"<<endl;
cout<<" 3.   ft -> m\t\t\t\t";cout<<"18.   g -> oz"<<endl;
cout<<" 4.   m -> ft\t\t\t\t";cout<<"19.   lb -> kg"<<endl;
cout<<" 5.   yd -> m\t\t\t\t";cout<<"20.   kg -> lb"<<endl;
cout<<" 6.   m -> yd\t\t\t\t";cout<<"21.   atm -> pa"<<endl;
cout<<" 7.   mile -> km\t\t\t";cout<<"22.   Pa -> atm"<<endl;
cout<<" 8.   km -> mile\t\t\t";cout<<"23.   mmHg -> pa"<<endl;
cout<<" 9.   mile -> m\t\t\t\t";cout<<"24.   pa -> mmHg"<<endl;
cout<<"10.   m -> mile\t\t\t\t";cout<<"25.   hp -> kW"<<endl;
cout<<"11.   acre -> m^2\t\t\t";cout<<"26.   kW -> hp"<<endl;
cout<<"12.   m^2 -> acre\t\t\t";cout<<"27.   F -> C"<<endl;
cout<<"13.   yd -> km\t\t\t\t";cout<<"28.   C -> F"<<endl;
cout<<"14.   km -> yd\t\t\t\t";cout<<"29.   J -> cal"<<endl;
cout<<"15.   km/h -> m/s\t\t\t";cout<<"30.   cal -> J"<<endl<<endl;
cout<<"You have to select the corresponding number of the required unit conversion !"<<endl;
cout<<"Example : If you want to select in -> cm, you should enter 1 below! "<<endl<<endl;
}};
class mains:public input{
public:
int condition(){
cout<<"Do you want to do more conversions ? 1. Yes 2. No Enter (1/2) : ";
cin>>select;
if(select == 1){
return choose();
}
else{
cout<<"Alright ! Thank You !";
return 0;
}}
/*<-------------------------------------MAIN PART STARTS------------------------------->*/
int choose(){
cout<<"Enter the number : ";
cin>>n;
if (n == 1){
cout<<"\nEnter the value of inches(in) : ";
cin>>in;
cm= in * 2.54;
cout<<"The result in centimeters(cm) is : "<<cm<<"cm"<<endl<<endl;
return condition();}
else if (n == 2){
cout<<"\nEnter the value of centimeters(cm) : ";
cin>>cm;
in = cm / 2.54;
cout<<"The result in inch(in) is : "<<in<<"inch"<<endl<<endl;
return condition();
}
else if (n == 3){
cout<<"\nEnter the value of foot(f) : ";
cin>>f;
m = f * 0.3048;
cout<<"The result of meters(m) is : "<<m<<"m"<<endl<<endl;
return condition();}
else if(n == 4){
cout<<"\nEnter the value of meter(m) : ";
cin>>m;
f = m/0.3048;
cout<<"The result of foot(f) is : "<<f<<"f"<<endl<<endl;
return condition();}
else if(n == 5){
cout<<"\nEnter the value of yard(yd) : ";
cin>>yd;
m= yd * 0.9144;
cout<<"The result of meter(m) is : "<<m<<"m"<<endl<<endl;
return condition();}
else if(n==6){
cout<<"\nEnter the value of meter(m) : ";
cin>>m;
yd = m/0.9144;
return condition();}
else if(n==7){
cout<<"\nEnter the value of mile : ";
cin>>mile;
km = mile*1.60934;
cout<<"The result of kilometers(km) is : "<<km<<"km"<<endl<<endl;
return condition();}
else if(n==8){
cout<<"\nEnter the value of kilometers(km) : ";
cin>>km;
mile = km/1.60934;
cout<<"The result of mile is : "<<mile<<"mile"<<endl<<endl;
return condition();}
else if (n==9){
cout<<"\nEnter the value of mile : ";
cin>>mile;
m = mile * 1609.34;
cout<<"The result of meter(m) is : "<<m<<"m"<<endl<<endl;
return condition();}
else if(n==10){
cout<<"\nEnter the value of meter(m) : ";
cin>>m;
mile = m / 1609.34;
cout<<"The result of mile is : "<<mile <<"mile"<<endl<<endl;
return condition();}
else if (n==11){
cout<<"\nEnter the value of acre : ";
cin>>acre;
msq= acre*4046.86;
cout<<"The result of meter(m) is : "<<msq<<"m"<<endl<<endl<<endl;
return condition();}
else if(n == 12){
cout<<"\nEnter the value of meter(m) : ";
cin>>msq;
acre = msq/4046.86;
cout<<"The result of acre is : "<<acre<<"acre"<<endl<<endl;
return condition();}
else if (n==13){
cout<<"\nEnter the value of yard(yd) : ";
cin>>yd;
km=yd*0.0009144;
cout<<"The result of kilometers(km) is : "<<km<<"km"<<endl<<endl;
return condition();}
else if(n==14){
cout<<"\nEnter the value of kiometers(km)  : ";
cin>>km;
yd=km/0.0009144;
cout<<"The result in yard(yd) is : "<<yd<<"yd"<<endl<<endl;
return condition();}
else if(n==15){
cout<<"\nEnter the value of km/h : ";
cin>>km;
m=km*1000;
speed = m/3600;
cout<<"The result in m/s is : "<<speed<<"m/s"<<endl<<endl;
return condition();}
else if(n==16){
cout<<"\nEnter the value of m/s : ";
cin>>m;
km = m * 3600/1000;
cout<<"The result in km/h is : "<<km<<"km/h"<<endl<<endl;
return condition();}
else if(n==17){
cout<<"\nEnter the value of ounces(oz) : ";
cin>>oz;
g=oz*28.3495;
cout<<"The result in gram(g) is : "<<g<<"g"<<endl<<endl;
return condition();}
else if(n==18){
cout<<"\nEnter the value of gram(g) : ";
cin>>g;
oz = g/28.3495;
cout<<"The result in ounces(oz) is : "<<oz<<"oz"<<endl<<endl;
return condition();}
else if(n==19){
cout<<"\nEnter the value of pounds (lb) : ";
cin>>lb;
kg = lb * 0.453592;
cout<<"The result in kilograms(kg) is : "<<kg<<"kg"<<endl<<endl;
return condition();}
else if ( n== 20){
cout<<"\nEnter the value of kilograms(kg) : ";
cin>>kg;
lb = kg/0.453592;
cout<<"The result in pounds(lb) is : "<<lb<<"lb"<<endl<<endl;
return condition();}
else if (n==21){
cout<<"\nEnter the value of Atmospheres(atm) : ";
cin>>atm;
pa=atm*101325;
cout<<"The result in pascals(pa) : "<<pa<<"pa"<<endl<<endl;
return condition();}
else if(n==22){
cout<<"\nEnter the value of Pascals(pa) : ";
cin>>pa;
atm = pa /101325;
cout<<"The result in Atmospheres (atm) is : "<<atm<<"atm"<<endl<<endl;
return condition();}
else if(n==23){
cout<<"\nEnter the value of mmHg : ";
cin>>mmHg;
pa=mmHg * 133.3223684;
cout<<"The result in Pascals(pa) is : "<<pa<<"pa"<<endl<<endl;
return condition();}
else if(n==24){
cout<<"\nEnter the value of pascals(pa) : ";
cin>>pa;
mmHg=pa/133.3223684;
cout<<"The result in mmHg is : "<<mmHg<<"mmHg"<<endl<<endl;
return condition();}
else if(n==25){
cout<<"\nEnter the value of HorsePower (hp): ";
cin>>hp;
kw = hp * 0.7355;
cout<<"The result in Kilowatts(kW) is : "<<kw<<"kW"<<endl<<endl;
return condition();}
else if(n==26){
cout<<"\nEnter the value of KiloWatts(kW) : ";
cin>>kw;
hp = kw/0.7355;
cout<<"The result in HorsePower(hp) is : "<<hp<<"Hp"<<endl<<endl;
return condition();}
else if (n==27){
cout<<"\nEnter the value of Fahrenheit(F) : ";
cin>>F;
C = 0.555555555556 * (F-32);
cout<<"The result in Celsius(C) is : "<<C<<"C"<<endl<<endl;
return condition();}
else if(n==28){
cout<<"\nEnter the value of Celsius(C) : ";
cin>>C;
F = 1.8 * C + 32;
cout<<"The result in Fahernheit(F) is : "<<F<<"F"<<endl<<endl;
return condition();}
else if(n==29){
cout<<"\nEnter the value of calories(cal) : ";
cin>>cal;
J = cal*4.184;
cout<<"The result in Joule(j) is : "<<J<<"J"<<endl<<endl;
return condition();}
else if (n==30){
cout<<"\nEnter the value of Joule(J) : ";
cin>>J;
cal = J/4.184;
cout<<"The result in calories(cal) is : "<<cal<<"cal"<<endl<<endl;
return condition();}
else{
cout<<"Wrong Input Provided !"<<endl<<"Do you want to re-input ? \t"<<"1. Yes\t\t"<<"2. No\t\t"<<"Enter (1/2): ";
cin>> wrong;
if(wrong == 1){
return choose();}
else {
cout<<"Alright ! Thank You!";
return 0;
}}}};
int main(){
mains x;
x.intro();
x.choose();
return 0;
}
