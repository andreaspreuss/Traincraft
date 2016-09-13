package src.train.client.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import src.train.client.render.CustomModelRenderer;
import src.train.common.entity.zeppelin.EntityZeppelinOneBalloon;

public class ModelZeppelinOneBalloon extends ModelBase {
	public float propel1 = 0.4188790204786391F;
	public float propel2 = 5.759586531581287F;
	private long lastframe;
	private float propel;
	
	public CustomModelRenderer box;
	public CustomModelRenderer box0;
	public CustomModelRenderer box1;
	public CustomModelRenderer box10;
	public CustomModelRenderer box104;
	public CustomModelRenderer box105;
	public CustomModelRenderer box106;
	public CustomModelRenderer box107;
	public CustomModelRenderer box108;
	public CustomModelRenderer box109;
	public CustomModelRenderer box11;
	public CustomModelRenderer box110;
	public CustomModelRenderer box111;
	public CustomModelRenderer box112;
	public CustomModelRenderer box113;
	public CustomModelRenderer box114;
	public CustomModelRenderer box115;
	public CustomModelRenderer box116;
	public CustomModelRenderer box117;
	public CustomModelRenderer box118;
	public CustomModelRenderer box119;
	public CustomModelRenderer box12;
	public CustomModelRenderer box120;
	public CustomModelRenderer box121;
	public CustomModelRenderer box123;
	public CustomModelRenderer box124;
	public CustomModelRenderer box13;
	public CustomModelRenderer box14;
	public CustomModelRenderer box15;
	public CustomModelRenderer box16;
	public CustomModelRenderer box17;
	public CustomModelRenderer box18;
	public CustomModelRenderer box19;
	public CustomModelRenderer box2;
	public CustomModelRenderer box20;
	public CustomModelRenderer box21;
	public CustomModelRenderer box22;
	public CustomModelRenderer box23;
	public CustomModelRenderer box24;
	public CustomModelRenderer box25;
	public CustomModelRenderer box26;
	public CustomModelRenderer box27;
	public CustomModelRenderer box28;
	public CustomModelRenderer box29;
	public CustomModelRenderer box3;
	public CustomModelRenderer box30;
	public CustomModelRenderer box31;
	public CustomModelRenderer box32;
	public CustomModelRenderer box33;
	public CustomModelRenderer box34;
	public CustomModelRenderer box35;
	public CustomModelRenderer box36;
	public CustomModelRenderer box37;
	public CustomModelRenderer box38;
	public CustomModelRenderer box39;
	public CustomModelRenderer box4;
	public CustomModelRenderer box40;
	public CustomModelRenderer box41;
	public CustomModelRenderer box42;
	public CustomModelRenderer box43;
	public CustomModelRenderer box44;
	public CustomModelRenderer box45;
	public CustomModelRenderer box46;
	public CustomModelRenderer box47;
	public CustomModelRenderer box48;
	public CustomModelRenderer box49;
	public CustomModelRenderer box5;
	public CustomModelRenderer box50;
	public CustomModelRenderer box51;
	public CustomModelRenderer box52;
	public CustomModelRenderer box53;
	public CustomModelRenderer box54;
	public CustomModelRenderer box55;
	public CustomModelRenderer box56;
	public CustomModelRenderer box57;
	public CustomModelRenderer box58;
	public CustomModelRenderer box59;
	public CustomModelRenderer box6;
	public CustomModelRenderer box60;
	public CustomModelRenderer box61;
	public CustomModelRenderer box62;
	public CustomModelRenderer box63;
	public CustomModelRenderer box64;
	public CustomModelRenderer box65;
	public CustomModelRenderer box66;
	public CustomModelRenderer box67;
	public CustomModelRenderer box68;
	public CustomModelRenderer box69;
	public CustomModelRenderer box7;
	public CustomModelRenderer box70;
	public CustomModelRenderer box71;
	public CustomModelRenderer box72;
	public CustomModelRenderer box73;
	public CustomModelRenderer box74;
	public CustomModelRenderer box75;
	public CustomModelRenderer box76;
	public CustomModelRenderer box77;
	public CustomModelRenderer box78;
	public CustomModelRenderer box8;
	public CustomModelRenderer box83;
	public CustomModelRenderer box84;
	public CustomModelRenderer box9;
	public CustomModelRenderer Propeller;
	public CustomModelRenderer Propeller2;

	public ModelZeppelinOneBalloon() {

		lastframe = System.nanoTime();
		propel = 0.0F;

		box = new CustomModelRenderer(68, 42, 128, 256);
		box.addBox(0F, 0F, 0F, 27, 20, 1);
		box.setPosition(-9F, 7F, 10F);
		box.rotateAngleY = -3.490658503988659F;
		box0 = new CustomModelRenderer(0, 179, 128, 256);
		box0.addBox(0F, 0F, 0F, 19, 4, 45);
		box0.setPosition(-89F, 49F, 23F);
		box0.rotateAngleY = -3.141592653589793F;
		box1 = new CustomModelRenderer(0, 179, 128, 256);
		box1.addBox(0F, 0F, 0F, 19, 4, 45);
		box1.setPosition(-111F, 45F, -2F);
		box1.rotateAngleX = -1.5707963267948966F;
		box1.rotateAngleY = -3.141592653589793F;
		box10 = new CustomModelRenderer(73, 98, 128, 256);
		box10.addBox(0F, 0F, 0F, 1, 1, 8);
		box10.setPosition(20F, 14F, -4F);
		box104 = new CustomModelRenderer(0, 0, 128, 256);
		box104.addBox(0F, 0F, 0F, 7, 6, 1);
		box104.setPosition(-19F, 12F, -14F);
		box105 = new CustomModelRenderer(0, 0, 128, 256);
		box105.addBox(0F, 0F, -1F, 7, 6, 1);
		box105.setPosition(-19F, 18F, -13F);
		box105.rotateAngleX = -0.7853981633974483F;
		box105.rotateAngleY = -6.283185307179586F;
		box106 = new CustomModelRenderer(0, 0, 128, 256);
		box106.addBox(0F, 0F, -1F, 7, 6, 1);
		box106.setPosition(-19F, 22F, -17F);
		box106.rotateAngleX = -1.5707963267948966F;
		box106.rotateAngleY = -6.283185307179586F;
		box107 = new CustomModelRenderer(0, 0, 128, 256);
		box107.addBox(0F, 0F, 0F, 7, 6, 1);
		box107.setPosition(-19F, 12F, -27F);
		box108 = new CustomModelRenderer(0, 0, 128, 256);
		box108.addBox(0F, 0F, 0F, 7, 6, 1);
		box108.setPosition(-19F, 18F, -27F);
		box108.rotateAngleX = -5.497787143782138F;
		box108.rotateAngleY = -6.283185307179586F;
		box109 = new CustomModelRenderer(0, 0, 128, 256);
		box109.addBox(0F, 0F, 0F, 7, 6, 1);
		box109.setPosition(-19F, 8F, -17F);
		box109.rotateAngleX = -1.5707963267948966F;
		box109.rotateAngleY = -6.283185307179586F;
		box11 = new CustomModelRenderer(69, 94, 128, 256);
		box11.addBox(-1F, 0F, 0F, 1, 1, 12);
		box11.setPosition(21F, 14F, 4F);
		box11.rotateAngleX = -6.283185307179586F;
		box11.rotateAngleY = -1.0122909661567112F;
		box110 = new CustomModelRenderer(0, 0, 128, 256);
		box110.addBox(0F, 0F, -1F, 7, 6, 1);
		box110.setPosition(-19F, 12F, -27F);
		box110.rotateAngleX = -3.9269908169872414F;
		box111 = new CustomModelRenderer(0, 0, 128, 256);
		box111.addBox(0F, 0F, 0F, 7, 6, 1);
		box111.setPosition(-19F, 12F, -13F);
		box111.rotateAngleX = -2.356194490192345F;
		box112 = new CustomModelRenderer(0, 25, 128, 256);
		box112.addBox(0F, -1F, -1F, 4, 2, 2);
		box112.setPosition(-16F, 15F, 20F);
		box113 = new CustomModelRenderer(0, 0, 128, 256);
		box113.addBox(0F, 0F, 0F, 7, 6, 1);
		box113.setPosition(-19F, 12F, 13F);
		box114 = new CustomModelRenderer(-1, 25, 128, 256);
		box114.addBox(0F, -1F, -1F, 4, 2, 2);
		box114.setPosition(-16F, 15F, -20F);
		box115 = new CustomModelRenderer(0, 0, 128, 256);
		box115.addBox(0F, 0F, 0F, 7, 6, 1);
		box115.setPosition(-19F, 12F, 26F);
		box116 = new CustomModelRenderer(0, 0, 128, 256);
		box116.addBox(0F, 0F, -1F, 7, 6, 1);
		box116.setPosition(-19F, 22F, 23F);
		box116.rotateAngleX = -1.5707963267948966F;
		box116.rotateAngleY = -6.283185307179586F;
		box117 = new CustomModelRenderer(0, 0, 128, 256);
		box117.addBox(0F, 0F, 0F, 7, 6, 1);
		box117.setPosition(-19F, 8F, 23F);
		box117.rotateAngleX = -1.5707963267948966F;
		box117.rotateAngleY = -6.283185307179586F;
		box118 = new CustomModelRenderer(0, 0, 128, 256);
		box118.addBox(0F, 0F, 0F, 7, 6, 1);
		box118.setPosition(-19F, 18F, 13F);
		box118.rotateAngleX = -5.497787143782138F;
		box118.rotateAngleY = -6.283185307179586F;
		box119 = new CustomModelRenderer(0, 0, 128, 256);
		box119.addBox(0F, 0F, -1F, 7, 6, 1);
		box119.setPosition(-19F, 18F, 27F);
		box119.rotateAngleX = -0.7853981633974483F;
		box119.rotateAngleY = -6.283185307179586F;
		box12 = new CustomModelRenderer(69, 94, 128, 256);
		box12.addBox(0F, 0F, 0F, 1, 1, 12);
		box12.setPosition(21F, 14F, -4F);
		box12.rotateAngleX = -6.283185307179586F;
		box12.rotateAngleY = -2.076941809873252F;
		box120 = new CustomModelRenderer(0, 0, 128, 256);
		box120.addBox(0F, 0F, -1F, 7, 6, 1);
		box120.setPosition(-19F, 12F, 13F);
		box120.rotateAngleX = -3.9269908169872414F;
		box121 = new CustomModelRenderer(0, 0, 128, 256);
		box121.addBox(0F, 0F, 0F, 7, 6, 1);
		box121.setPosition(-19F, 12F, 27F);
		box121.rotateAngleX = -2.356194490192345F;
		box123 = new CustomModelRenderer(0, 138, 128, 256);
		box123.addBox(0F, 0F, 0F, 44, 20, 20);
		box123.setPosition(65F, 27F, -10F);
		box123.rotateAngleZ = -5.969026041820607F;
		box124 = new CustomModelRenderer(0, 138, 128, 256);
		box124.addBox(0F, 0F, 0F, 44, 20, 20);
		box124.setPosition(65F, 41F, 24F);
		box124.rotateAngleX = -1.5707963267948966F;
		box124.rotateAngleY = -5.969026041820607F;
		box124.rotateAngleZ = -6.283185307179586F;
		box13 = new CustomModelRenderer(0, 1, 128, 256);
		box13.addBox(0F, 0F, 0F, 44, 1, 20);
		box13.setPosition(-67F, 27F, -10F);
		box14 = new CustomModelRenderer(0, 1, 128, 256);
		box14.addBox(0F, 0F, 0F, 44, 1, 20);
		box14.setPosition(21F, 41F, 24F);
		box14.rotateAngleX = -1.5707963267948966F;
		box15 = new CustomModelRenderer(0, 1, 128, 256);
		box15.addBox(0F, 0F, 0F, 44, 1, 20);
		box15.setPosition(21F, 27F, -10F);
		box16 = new CustomModelRenderer(0, 138, 128, 256);
		box16.addBox(0F, 0F, 0F, 44, 20, 20);
		box16.setPosition(65F, 75F, 10F);
		box16.rotateAngleX = -3.141592653589793F;
		box16.rotateAngleY = -6.283185307179586F;
		box16.rotateAngleZ = -0.3141592653589793F;
		box17 = new CustomModelRenderer(0, 1, 128, 256);
		box17.addBox(0F, -1F, 0F, 44, 1, 20);
		box17.setPosition(-23F, 41F, -24F);
		box17.rotateAngleX = -1.5707963267948966F;
		box18 = new CustomModelRenderer(0, 1, 128, 256);
		box18.addBox(0F, -1F, 0F, 44, 1, 20);
		box18.setPosition(-67F, 41F, -24F);
		box18.rotateAngleX = -1.5707963267948966F;
		box19 = new CustomModelRenderer(0, 1, 128, 256);
		box19.addBox(0F, -1F, 0F, 44, 1, 20);
		box19.setPosition(-23F, 61F, -24F);
		box19.rotateAngleX = -0.7853981633974483F;
		box2 = new CustomModelRenderer(0, 179, 128, 256);
		box2.addBox(0F, 0F, 0F, 19, 4, 45);
		box2.setPosition(-111F, 14F, -2F);
		box2.rotateAngleX = -1.5707963267948966F;
		box2.rotateAngleY = -3.141592653589793F;
		box20 = new CustomModelRenderer(0, 1, 128, 256);
		box20.addBox(0F, -1F, 0F, 44, 1, 20);
		box20.setPosition(-67F, 61F, -24F);
		box20.rotateAngleX = -0.7853981633974483F;
		box21 = new CustomModelRenderer(0, 1, 128, 256);
		box21.addBox(0F, 0F, 0F, 44, 1, 20);
		box21.setPosition(-23F, 61F, 24F);
		box21.rotateAngleX = -2.356194490192345F;
		box22 = new CustomModelRenderer(0, 1, 128, 256);
		box22.addBox(0F, 0F, 0F, 44, 1, 20);
		box22.setPosition(-67F, 61F, 24F);
		box22.rotateAngleX = -2.356194490192345F;
		box23 = new CustomModelRenderer(120, 25, 128, 256);
		box23.addBox(0F, 0F, 0F, 1, 12, 1);
		box23.setPosition(10F, 15F, -10F);
		box24 = new CustomModelRenderer(0, 1, 128, 256);
		box24.addBox(0F, 0F, 0F, 44, 1, 20);
		box24.setPosition(-67F, 41F, 24F);
		box24.rotateAngleX = -1.5707963267948966F;
		box25 = new CustomModelRenderer(0, 26, 128, 256);
		box25.addBox(0F, 0F, 0F, 13, 2, 40);
		box25.setPosition(-29F, 14F, -20F);
		box26 = new CustomModelRenderer(0, 138, 128, 256);
		box26.addBox(0F, 0F, 0F, 44, 20, 20);
		box26.setPosition(-103F, 43F, -10F);
		box26.rotateAngleZ = -5.969026041820607F;
		box27 = new CustomModelRenderer(2, 117, 128, 256);
		box27.addBox(0F, 0F, 0F, 30, 5, 1);
		box27.setPosition(-22F, 0F, 6F);
		box28 = new CustomModelRenderer(2, 117, 128, 256);
		box28.addBox(0F, 0F, 0F, 30, 5, 1);
		box28.setPosition(-22F, 0F, -7F);
		box29 = new CustomModelRenderer(120, 25, 128, 256);
		box29.addBox(0F, 0F, 0F, 1, 12, 1);
		box29.setPosition(10F, 15F, 9F);
		box3 = new CustomModelRenderer(0, 179, 128, 256);
		box3.addBox(0F, 0F, 0F, 19, 4, 45);
		box3.setPosition(-92F, 30F, -2F);
		box3.rotateAngleX = -1.5707963267948966F;
		box3.rotateAngleY = -3.141592653589793F;
		box30 = new CustomModelRenderer(120, 25, 128, 256);
		box30.addBox(0F, 0F, 0F, 1, 12, 1);
		box30.setPosition(20F, 15F, 3F);
		box31 = new CustomModelRenderer(120, 25, 128, 256);
		box31.addBox(0F, 0F, 0F, 1, 12, 1);
		box31.setPosition(20F, 15F, -4F);
		box32 = new CustomModelRenderer(32, 29, 128, 256);
		box32.addBox(0F, 0F, 0F, 1, 20, 2);
		box32.setPosition(-35F, 7F, -1F);
		box33 = new CustomModelRenderer(0, 1, 128, 256);
		box33.addBox(0F, 0F, 0F, 44, 1, 20);
		box33.setPosition(21F, 27F, 10F);
		box33.rotateAngleX = -0.7853981633974483F;
		box34 = new CustomModelRenderer(120, 25, 128, 256);
		box34.addBox(0F, 0F, 0F, 1, 12, 1);
		box34.setPosition(-9F, 15F, 9F);
		box35 = new CustomModelRenderer(0, 138, 128, 256);
		box35.addBox(0F, 0F, 0F, 44, 20, 20);
		box35.setPosition(-103F, 59F, 10F);
		box35.rotateAngleX = -3.141592653589793F;
		box35.rotateAngleY = -6.283185307179586F;
		box35.rotateAngleZ = -0.3141592653589793F;
		box36 = new CustomModelRenderer(0, 138, 128, 256);
		box36.addBox(0F, -1F, 0F, 44, 20, 20);
		box36.setPosition(-108F, 41F, 10F);
		box36.rotateAngleX = -1.5707963267948966F;
		box36.rotateAngleY = -0.3141592653589793F;
		box37 = new CustomModelRenderer(0, 138, 128, 256);
		box37.addBox(0F, 0F, 0F, 44, 20, 20);
		box37.setPosition(-103F, 41F, 8F);
		box37.rotateAngleX = -1.5707963267948966F;
		box37.rotateAngleY = -5.969026041820607F;
		box37.rotateAngleZ = -6.283185307179586F;
		box38 = new CustomModelRenderer(0, 1, 128, 256);
		box38.addBox(0F, 0F, 0F, 44, 1, 20);
		box38.setPosition(65F, 61F, 24F);
		box38.rotateAngleX = -2.413834612632515F;
		box38.rotateAngleY = -5.969026041820607F;
		box38.rotateAngleZ = -0.3141592653589793F;
		box39 = new CustomModelRenderer(0, 1, 128, 256);
		box39.addBox(0F, 0F, 0F, 44, 1, 20);
		box39.setPosition(21F, 61F, 24F);
		box39.rotateAngleX = -2.356194490192345F;
		box4 = new CustomModelRenderer(68, 42, 128, 256);
		box4.addBox(0F, 0F, -1F, 27, 20, 1);
		box4.setPosition(-9F, 7F, -10F);
		box4.rotateAngleY = -2.792526803190927F;
		box4.rotateAngleZ = -6.283185307179586F;
		box40 = new CustomModelRenderer(0, 1, 128, 256);
		box40.addBox(0F, 0F, 0F, 44, 1, 20);
		box40.setPosition(65F, 27F, 10F);
		box40.rotateAngleX = -0.7377580409572782F;
		box40.rotateAngleY = -5.951572749300664F;
		box40.rotateAngleZ = -5.969026041820607F;
		box41 = new CustomModelRenderer(85, 94, 128, 256);
		box41.addBox(0F, 0F, 0F, 20, 8, 1);
		box41.setPosition(-9F, 7F, -10F);
		box42 = new CustomModelRenderer(85, 94, 128, 256);
		box42.addBox(0F, 0F, 0F, 20, 8, 1);
		box42.setPosition(-9F, 7F, 9F);
		box43 = new CustomModelRenderer(0, 1, 128, 256);
		box43.addBox(0F, -1F, 0F, 44, 1, 20);
		box43.setPosition(65F, 61F, -24F);
		box43.rotateAngleX = -0.7377580409572782F;
		box43.rotateAngleY = -0.3141592653589793F;
		box43.rotateAngleZ = -0.3141592653589793F;
		box44 = new CustomModelRenderer(0, 1, 128, 256);
		box44.addBox(0F, 0F, 0F, 44, 1, 20);
		box44.setPosition(21F, 75F, 10F);
		box44.rotateAngleX = -3.141592653589793F;
		box45 = new CustomModelRenderer(0, 1, 128, 256);
		box45.addBox(0F, -1F, 0F, 44, 1, 20);
		box45.setPosition(65F, 27F, -10F);
		box45.rotateAngleX = -2.403834612632515F;
		box45.rotateAngleY = -0.33161255787892263F;
		box45.rotateAngleZ = -5.969026041820607F;
		box46 = new CustomModelRenderer(0, 1, 128, 256);
		box46.addBox(0F, 0F, 0F, 44, 1, 20);
		box46.setPosition(-107F, 41F, 4F);
		box46.rotateAngleX = -2.403834612632515F;
		box46.rotateAngleY = -5.969026041820607F;
		box46.rotateAngleZ = -0.3141592653589793F;
		box47 = new CustomModelRenderer(0, 1, 128, 256);
		box47.addBox(0F, -1F, 0F, 44, 1, 20);
		box47.setPosition(-106F, 41F, -4F);
		box47.rotateAngleX = -0.7377580409572782F;
		box47.rotateAngleY = -0.3141592653589793F;
		box47.rotateAngleZ = -0.3141592653589793F;
		box48 = new CustomModelRenderer(0, 1, 128, 256);
		box48.addBox(0F, 0F, 0F, 44, 1, 20);
		box48.setPosition(-106F, 47F, -10F);
		box48.rotateAngleX = -0.7377580409572782F;
		box48.rotateAngleY = -5.951572749300664F;
		box48.rotateAngleZ = -5.969026041820607F;
		box49 = new CustomModelRenderer(0, 1, 128, 256);
		box49.addBox(0F, -1F, 0F, 44, 1, 20);
		box49.setPosition(21F, 61F, -24F);
		box49.rotateAngleX = -0.7853981633974483F;
		box5 = new CustomModelRenderer(120, 25, 128, 256);
		box5.addBox(-1F, 0F, 0F, 1, 15, 1);
		box5.setPosition(11F, 5F, -10F);
		box5.rotateAngleX = -5.8817595792208905F;
		box5.rotateAngleZ = -0.8377580409572782F;
		box50 = new CustomModelRenderer(0, 1, 128, 256);
		box50.addBox(0F, -1F, 0F, 44, 1, 20);
		box50.setPosition(-106F, 47F, 10F);
		box50.rotateAngleX = -2.403834612632515F;
		box50.rotateAngleY = -0.33161255787892263F;
		box50.rotateAngleZ = -5.969026041820607F;
		box51 = new CustomModelRenderer(0, 69, 128, 256);
		box51.addBox(0F, 0F, -20F, 44, 4, 20);
		box51.setPosition(-70F, 27F, 2F);
		box51.rotateAngleX = -1.5707963267948966F;
		box51.rotateAngleZ = -2.8448866807507573F;
		box52 = new CustomModelRenderer(0, 179, 128, 256);
		box52.addBox(0F, 0F, 0F, 19, 4, 45);
		box52.setPosition(-108F, 49F, 45F);
		box52.rotateAngleY = -3.141592653589793F;
		box53 = new CustomModelRenderer(0, 1, 128, 256);
		box53.addBox(0F, 0F, 0F, 44, 1, 20);
		box53.setPosition(-23F, 75F, 10F);
		box53.rotateAngleX = -3.141592653589793F;
		box54 = new CustomModelRenderer(0, 138, 128, 256);
		box54.addBox(0F, -1F, 0F, 44, 20, 20);
		box54.setPosition(59F, 41F, -6F);
		box54.rotateAngleX = -1.5707963267948966F;
		box54.rotateAngleY = -0.3141592653589793F;
		box55 = new CustomModelRenderer(0, 1, 128, 256);
		box55.addBox(0F, -1F, 0F, 44, 1, 20);
		box55.setPosition(21F, 41F, -24F);
		box55.rotateAngleX = -1.5707963267948966F;
		box56 = new CustomModelRenderer(0, 1, 128, 256);
		box56.addBox(0F, -1F, 0F, 44, 1, 20);
		box56.setPosition(21F, 27F, -10F);
		box56.rotateAngleX = -2.356194490192345F;
		box57 = new CustomModelRenderer(0, 179, 128, 256);
		box57.addBox(0F, 0F, 0F, 19, 4, 45);
		box57.setPosition(-108F, 49F, 0F);
		box57.rotateAngleY = -3.141592653589793F;
		box58 = new CustomModelRenderer(66, 127, 128, 256);
		box58.addBox(0F, 0F, -3F, 26, 1, 3);
		box58.setPosition(-9F, 7F, 10F);
		box58.rotateAngleX = -3.141592653589793F;
		box58.rotateAngleY = -3.490658503988659F;
		box58.rotateAngleZ = -6.283185307179586F;
		box59 = new CustomModelRenderer(0, 1, 128, 256);
		box59.addBox(0F, 0F, 0F, 44, 1, 20);
		box59.setPosition(-67F, 75F, 10F);
		box59.rotateAngleX = -3.141592653589793F;
		box6 = new CustomModelRenderer(120, 25, 128, 256);
		box6.addBox(-1F, 0F, -1F, 1, 15, 1);
		box6.setPosition(11F, 5F, 10F);
		box6.rotateAngleX = -0.4188790204786391F;
		box6.rotateAngleZ = -0.8377580409572782F;
		box60 = new CustomModelRenderer(0, 69, 128, 256);
		box60.addBox(0F, 0F, 0F, 44, 4, 20);
		box60.setPosition(-70F, 49F, 23F);
		box60.rotateAngleY = -2.6179938779914944F;
		box61 = new CustomModelRenderer(0, 69, 128, 256);
		box61.addBox(0F, 0F, -20F, 44, 4, 20);
		box61.setPosition(-70F, 49F, -23F);
		box61.rotateAngleY = -3.6651914291880923F;
		box62 = new CustomModelRenderer(0, 69, 128, 256);
		box62.addBox(0F, 0F, 0F, 44, 4, 20);
		box62.setPosition(-70F, 75F, 2F);
		box62.rotateAngleX = -1.5707963267948966F;
		box62.rotateAngleZ = -3.490658503988659F;
		box63 = new CustomModelRenderer(0, 1, 128, 256);
		box63.addBox(0F, 0F, 0F, 44, 1, 20);
		box63.setPosition(-23F, 27F, 10F);
		box63.rotateAngleX = -0.7853981633974483F;
		box64 = new CustomModelRenderer(0, 1, 128, 256);
		box64.addBox(0F, 0F, 0F, 44, 1, 20);
		box64.setPosition(-67F, 27F, 10F);
		box64.rotateAngleX = -0.7853981633974483F;
		box65 = new CustomModelRenderer(7, 124, 128, 256);
		box65.addBox(0F, 0F, 0F, 20, 1, 6);
		box65.setPosition(-28F, 5F, -3F);
		box65.rotateAngleY = -6.09119908946021F;
		box66 = new CustomModelRenderer(7, 124, 128, 256);
		box66.addBox(0F, 0F, -6F, 20, 1, 6);
		box66.setPosition(-28F, 5F, 3F);
		box66.rotateAngleY = -0.19198621771937624F;
		box67 = new CustomModelRenderer(1, 230, 128, 256);
		box67.addBox(0F, 0F, 0F, 12, 12, 12);
		box67.setPosition(-20F, 7F, -6F);
		box68 = new CustomModelRenderer(0, 1, 128, 256);
		box68.addBox(0F, 0F, 0F, 44, 1, 20);
		box68.setPosition(-23F, 41F, 24F);
		box68.rotateAngleX = -1.5707963267948966F;
		box69 = new CustomModelRenderer(78, 112, 128, 256);
		box69.addBox(0F, 0F, 0F, 1, 8, 6);
		box69.setPosition(4F, 7F, -3F);
		box7 = new CustomModelRenderer(66, 127, 128, 256);
		box7.addBox(0F, 0F, 0F, 26, 1, 3);
		box7.setPosition(-9F, 7F, -10F);
		box7.rotateAngleX = -3.141592653589793F;
		box7.rotateAngleY = -2.792526803190927F;
		box7.rotateAngleZ = -6.283185307179586F;
		box70 = new CustomModelRenderer(93, 107, 128, 256);
		box70.addBox(0F, 0F, 0F, 5, 7, 12);
		box70.setPosition(9F, 5F, -6F);
		box70.rotateAngleY = -6.283185307179586F;
		box70.rotateAngleZ = -5.497787143782138F;
		box71 = new CustomModelRenderer(85, 179, 128, 256);
		box71.addBox(0F, -6F, -6F, 13, 6, 6);
		box71.setPosition(-31F, 18F, -17F);
		box72 = new CustomModelRenderer(85, 179, 128, 256);
		box72.addBox(0F, -6F, -6F, 13, 6, 6);
		box72.setPosition(-31F, 18F, 23F);
		box73 = new CustomModelRenderer(69, 94, 128, 256);
		box73.addBox(0F, 0F, 0F, 1, 1, 12);
		box73.setPosition(21F, 26F, -4F);
		box73.rotateAngleX = -6.283185307179586F;
		box73.rotateAngleY = -2.076941809873252F;
		box74 = new CustomModelRenderer(73, 98, 128, 256);
		box74.addBox(0F, 0F, 0F, 1, 1, 8);
		box74.setPosition(20F, 26F, -4F);
		box75 = new CustomModelRenderer(69, 94, 128, 256);
		box75.addBox(-1F, 0F, 0F, 1, 1, 12);
		box75.setPosition(21F, 26F, 4F);
		box75.rotateAngleX = -6.283185307179586F;
		box75.rotateAngleY = -1.0122909661567112F;
		box76 = new CustomModelRenderer(85, 94, 128, 256);
		box76.addBox(0F, 0F, 0F, 20, 1, 1);
		box76.setPosition(-9F, 26F, -10F);
		box77 = new CustomModelRenderer(85, 94, 128, 256);
		box77.addBox(0F, 0F, 0F, 20, 1, 1);
		box77.setPosition(-9F, 26F, 9F);
		box78 = new CustomModelRenderer(1, 179, 128, 256);
		box78.addBox(0F, 0F, -1F, 20, 20, 1);
		box78.setPosition(106F, 41F, -10F);
		box78.rotateAngleY = -1.5707963267948966F;
		box8 = new CustomModelRenderer(0, 1, 128, 256);
		box8.addBox(0F, 0F, 0F, 44, 1, 20);
		box8.setPosition(-23F, 27F, -10F);
		box83 = new CustomModelRenderer(0, 1, 128, 256);
		box83.addBox(0F, -1F, 0F, 44, 1, 20);
		box83.setPosition(-23F, 27F, -10F);
		box83.rotateAngleX = -2.356194490192345F;
		box84 = new CustomModelRenderer(0, 1, 128, 256);
		box84.addBox(0F, -1F, 0F, 44, 1, 20);
		box84.setPosition(-67F, 27F, -10F);
		box84.rotateAngleX = -2.356194490192345F;
		box9 = new CustomModelRenderer(2, 94, 128, 256);
		box9.addBox(0F, 0F, 0F, 20, 2, 20);
		box9.setPosition(-9F, 5F, -10F);
		Propeller = new CustomModelRenderer(1, 26, 128, 256);
		Propeller.addBox(0F, -6F, -6F, 1, 12, 12);
		Propeller.setPosition(-16F, 15F, -20F);
		Propeller2 = new CustomModelRenderer(1, 26, 128, 256);
		Propeller2.addBox(0F, -6F, -6F, 1, 12, 12);
		Propeller2.setPosition(-16F, 15F, 20F);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		if (((EntityZeppelinOneBalloon) entity).getFuel() > 0) {
			long now = System.nanoTime();
			int elapsed = (int) ((now - lastframe) / (1000 * 1000));
			propel -= (float) elapsed / 300.0f;
			lastframe = now;
			//Propeller.rotateAngleZ = 0;
			Propeller.rotateAngleX = propel + propel1;
			Propeller2.rotateAngleX = propel + propel2;
		}
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box10.render(f5);
		box104.render(f5);
		box105.render(f5);
		box106.render(f5);
		box107.render(f5);
		box108.render(f5);
		box109.render(f5);
		box11.render(f5);
		box110.render(f5);
		box111.render(f5);
		box112.render(f5);
		box113.render(f5);
		box114.render(f5);
		box115.render(f5);
		box116.render(f5);
		box117.render(f5);
		box118.render(f5);
		box119.render(f5);
		box12.render(f5);
		box120.render(f5);
		box121.render(f5);
		box123.render(f5);
		box124.render(f5);
		box13.render(f5);
		box14.render(f5);
		box15.render(f5);
		box16.render(f5);
		box17.render(f5);
		box18.render(f5);
		box19.render(f5);
		box2.render(f5);
		box20.render(f5);
		box21.render(f5);
		box22.render(f5);
		box23.render(f5);
		box24.render(f5);
		box25.render(f5);
		box26.render(f5);
		box27.render(f5);
		box28.render(f5);
		box29.render(f5);
		box3.render(f5);
		box30.render(f5);
		box31.render(f5);
		box32.render(f5);
		box33.render(f5);
		box34.render(f5);
		box35.render(f5);
		box36.render(f5);
		box37.render(f5);
		box38.render(f5);
		box39.render(f5);
		box4.render(f5);
		box40.render(f5);
		box41.render(f5);
		box42.render(f5);
		box43.render(f5);
		box44.render(f5);
		box45.render(f5);
		box46.render(f5);
		box47.render(f5);
		box48.render(f5);
		box49.render(f5);
		box5.render(f5);
		box50.render(f5);
		box51.render(f5);
		box52.render(f5);
		box53.render(f5);
		box54.render(f5);
		box55.render(f5);
		box56.render(f5);
		box57.render(f5);
		box58.render(f5);
		box59.render(f5);
		box6.render(f5);
		box60.render(f5);
		box61.render(f5);
		box62.render(f5);
		box63.render(f5);
		box64.render(f5);
		box65.render(f5);
		box66.render(f5);
		box67.render(f5);
		box68.render(f5);
		box69.render(f5);
		box7.render(f5);
		box70.render(f5);
		box71.render(f5);
		box72.render(f5);
		box73.render(f5);
		box74.render(f5);
		box75.render(f5);
		box76.render(f5);
		box77.render(f5);
		box78.render(f5);
		box8.render(f5);
		box83.render(f5);
		box84.render(f5);
		box9.render(f5);
		Propeller.render(f5);
		Propeller2.render(f5);

	}
}
