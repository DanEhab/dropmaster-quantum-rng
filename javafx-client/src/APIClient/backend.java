package APIClient;

public class backend {

	public static String General(int x) {
		String r = "";
		if(x>=0 & x<=14363) {
			r="1 Medium bladed rune salvage";
		}
		if(x>= 14364 & x<=28727) {
			r="1 Huge plated rune salvage";
		}
		if(x>=28728 &x<=43090) {
			r="3 Orichalcite stone spirit";
		}
		if(x>=43090 & x<=57453) {
			r="3 Drakolith stone spirit";
		}
		if(x>=57454 & x<=71816) {
			r="1 Snapdragon seed";
		}
		if(x>=71817 & x<=79696) {
			r="3 Ourg bones";
		}
		if(x>=79697 & x<=87576) {
			r="1 Medium spiky rune salvage";
		}
		if(x>=87577 & x<=95456) {
			r="1 Large bladed rune salvage";
		}
		if(x>=95457 & x<=103336) {
			r="3 Runite stone spirit";
		}
		if (x>=103337 & x<=111216) {
			r="15 Magic logs";
		}
		if(x>=111217 & x<=119096) {
			r="3 Super restore";
		}
		if(x>=119097 & x<=126976) {
			r="1 Grimy snapdragon";
		}
		if(x>=126977 & x<=127743) {
			r="19,501 Coins";
		}
		if(x>=127744 & x<=128256) {
			r="20,500 Coins";
		}
		if(x>=128257 & x<=128598) {
			r="1 Bandos helmet";
		}
		if(x>=128599 & x<=128940) {
			r="1 Bandos chestplate";
		}
		if(x>=128941 & x<=129282) {
			r="1 Bandos tassets";
		}
		if(x>=129283 & x<=129624) {
			r="1 Bandos gloves";
		}
		if(x>=129625 & x<=129966) {
			r="1 Bandos boots";
		}
		if(x>=129967 & x<=130308) {
			r="1 Bandos warshield";
		}
		if(x>=130309 & x<=130479) {
			r="1 Godsword shard 1";
		}
		if(x>=130480 & x<=130650) {
			r="1 Godsword shard 2";
		}
		if(x>=130651 & x<=130821) {
			r="1 Godsword shard 3";
		}
		if(x>=130822 & x<=131072) {
			r="Bandos hilt";
		}
		return r;
		
	}
	
//Kril
	public static String KT_items(int x){
			String r = ""; 
			if(x>=0 & x<=12093) {
				r="19,500 Coins";
			}
			if(x>= 12094 & x<=24187) {
				r="5 Infernal ashes";
			}
			if(x>=24188 & x<=36281) {
				r="Medium bladed rune salvage";
			}
			if(x>=36282 & x<=48375) {
				r="Huge plated adamant salvage";
			}
			if(x>=48376 & x<=60469) {
				r="Large plated rune salvage";
			}
			if(x>=60470 & x<=72563) {
				r="3 Super attack (3)";
			}
			if(x>=72564 & x<=84657) {
				r="3 Super strength (3)";
			}
			if(x>=84658 & x<=96751) {
				r="3 Super restore (3)";
			}
			if(x>=96752 & x<=108845) {
				r="3 Zamorak brew (3)";
			}
			if (x>=108846 & x<=114892) {
				r="3 Lantadyme seed";
			}
			if(x>=114893 & x<=120939) {
				r="3 Orichalcite stone spirit";
			}
			if(x>=120940 & x<=126986) {
				r="2 Wine of Zamorak";
			}
			if(x>=126987 & x<=127753) {
				r="19,501 Coins";
			}
			if(x>=127754 & x<=128266) {
				r="20,500 Coins";
			}
			if(x>=128267 & x<=128523) {
				r="Hood of subjugation";
			}
			if(x>=128524 & x<=128780) {
				r="Garb of subjugation";
			}
			if(x>=128781 & x<=129037) {
				r="Gown of subjugation";
			}
			if(x>=129038 & x<=129294) {
				r="Gloves of subjugation";
			}
			if(x>=129295 & x<=129551) {
				r="Boots of subjugation";
			}
			if(x>=129552 & x<=129808) {
				r="Ward of subjugation";
			}
			if(x>=129809 & x<=130065) {
				r="Zamorakian spear";
			}
			if(x>=130066 & x<=130322) {
				r="Steam battlestaff";
			}
			if(x>=130323 & x<=130494) {
				r="Godsword shard 1";
			}
			if(x>=130495 & x<=130665) {
				r="Godsword shard 2";
			}
			
			if(x>=130666 & x<=130837){
				r = "Godsword shard 3";
			}
			
			if(x>=130838 & x<=131072){
				r = "Zamorak hilt";
			}
			
			return r;
		}
	
	//KREE ARRA 
	public static String KA_items(int x){
			String r = ""; 
			if(x>=0 & x<=7162) {
				r="Small spiky rune salvage";
			}
			if(x>= 7163 & x<=15255) {
				r="20 Rune bolts";
			}
			if(x>=15256 & x<=23448) {
				r="100 Rune arrow";
			}
			if(x>=23449 & x<=31641) {
				r="Black dragonhide body";
			}
			if(x>=31642 & x<=38804) {
				r="Medium bladed rune salvage";
			}
			if(x>=38805 & x<=46997) {
				r="5 Dragon bolts (e)";
			}
			if(x>=46998 & x<=55190) {
				r="3 Super ranging potion (3)";
			}
			if(x>=55191 & x<=63383) {
				r="3 Super defence (3)";
			}
			if(x>=63384 & x<=71576) {
				r="3 Dwarf weed seed";
			}
			if (x>=71577 & x<=76697) {
				r="12 Crushed nest";
			}
			if(x>=76698 & x<=77722) {
				r="Yew seed";
			}
			if(x>=77723 & x<=78747) {
				r="Crystal key";
			}
			if(x>=78748 & x<=79514) {
				r="19,501 Coins";
			}
			if(x>=79515 & x<=80027) {
				r="20,500 Coins";
			}
			if(x>=80028 & x<=80369) {
				r="Armadyl helmet";
			}
			if(x>=80370 & x<=80711) {
				r="Armadyl chestplate";
			}
			if(x>=80712 & x<=81053) {
				r="Armadyl chainskirt";
			}
			if(x>=81054 & x<=81396) {
				r="Armadyl gloves";
			}
			if(x>=81397 & x<=81738) {
				r="Armadyl boots";
			}
			if(x>=81739 & x<=82080) {
				r="Armadyl buckler";
			}
			if(x>=82081 & x<=82251) {
				r="Godsword shard 1";
			}
			if(x>=82252 & x<=82422) {
				r="Godsword shard 2";
			}
			if(x>=82423 & x<=82593) {
				r="Godsword shard 3";
			}
			if(x>=82594 & x<=82850) {
				r="	Armadyl hilt";
			}
			
			if(x>=82851 & x<=131072){
				r = "Armadyl Sword";
			}
			return r;
		}
	
	//COMMANDER ZILYANA
	public static String CZ_items(int x){
			String r = ""; 
			if(x>=0 & x<=16652) {
				r="2 Ranarr seed";
			}
			if(x>= 16653 & x<=33306) {
				r="30 Rune dart";
			}
			if(x>=33307 & x<=49960) {
				r="30 Off-hand rune dart";
			}
			if(x>=49961 & x<=66612) {
				r="Large plated rune salvage";
			}
			if(x>=66613 & x<=72860) {
				r="6 Diamond";
			}
			if(x>=72861 & x<=79105) {
				r="3 Prayer potion (4)";
			}
			if(x>=79106 & x<=85350) {
				r="3 Saradomin brew (3)";
			}
			if(x>=85351 & x<=91595) {
				r="3 Super restore (4)";
			}
			if(x>=91596 & x<=97840) {
				r="3 Super defence (3)";
			}
			if (x>=97841 & x<=104084) {
				r="3 Super magic potion (3)";
			}
			if(x>=104085 & x<=110330) {
				r="5 Unicorn horn";
			}
			if(x>=110331 & x<=116575) {
				r="2 Battlestaff";
			}
			if(x>=116576 & x<=122820) {
				r="	Huge plated adamant salvage";
			}
			if(x>=122821 & x<=124902) {
				r="Magic seed";
			}
			if(x>=124903 & x<=125669) {
				r="19,501 Coins";
			}
			if(x>=125670 & x<=126182) {
				r="20,500 Coins";
			}
			if(x>=126183 & x<=126591) {
				r="	Saradomin sword";
			}
			if(x>=126592 & x<=126796) {
				r="Armadyl crossbow";
			}
			if(x>=126797 & x<=127000) {
				r="Off-hand Armadyl crossbow";
			}
			if(x>=127001 & x<=127410) {
				r="Saradomin's murmur";
			}
			if(x>=127411 & x<=127820) {
				r="	Saradomin's hiss";
			}
			if(x>=127821 & x<=128230) {
				r="Saradomin's whisper";
			}
			if(x>=128231 & x<=128401) {
				r="	Godsword shard 1";
			}
			if(x>=128402 & x<=128571) {
				r="Godsword shard 2";
			}
			
			if(x>=128572 & x<=128743){
				r = "Godsword shard 3";
			}
			
			if(x>=128744 & x<=129000){
				r = "Saradomin hilt";
			}
			
			if(x>=129001 & x<=131072){
				r = "Saradomin Dagger";
			}
			
			return r;

		}
	
}
