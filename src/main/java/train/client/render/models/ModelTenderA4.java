// Date: 1/13/2017 1:42:33 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
// - Fixed by ApocTheWanderer

package train.client.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelTenderA4 extends ModelBase
{
	
	ModelRenderer		HookF;
	ModelRenderer		HookR;
	ModelRenderer		Roof;
	ModelRenderer		Tender_Floor;
	ModelRenderer		Tender_Frame;
	ModelRenderer		TenderSideLeft;
	ModelRenderer		TenderSideRight;
	ModelRenderer		TenderFrontPartition;
	ModelRenderer		TenderCenterPartition;
	ModelRenderer		TenderRearPartition;
	ModelRenderer		Buffer_L;
	ModelRenderer		Buffer_R;
	ModelRenderer		Joint_L;
	ModelRenderer		Joint_R;
	ModelRenderer		Bumper_L;
	ModelRenderer		Bumper_R;
	ModelRenderer		Angle_L;
	ModelRenderer		Angle_R;
	ModelRenderer		CabRoof1;
	ModelRenderer		CabRoof2;
	ModelRenderer		CabRoof3;
	ModelRenderer		CabRoof4;
	ModelRenderer		CabRoof5;
	ModelRenderer		CabRoof6;
	ModelRenderer		CabRoof7;
	ModelRenderer		CabRoof8;
	ModelRenderer		CabRoof9;
	ModelRenderer		CabRoof10;
	ModelRenderer		CabRoof11;
	ModelRenderer		Wheels_L;
	ModelRenderer		Wheels_R;
	ModelRenderer		Stack;
	ModelRenderer		Wheel_hub_L;
	ModelRenderer		Wheel_hub_L2;
	ModelRenderer		Wheel_hub_L3;
	ModelRenderer		Wheel_hub_L4;
	ModelRenderer		Wheel_hub_R;
	ModelRenderer		Wheel_hub_R2;
	ModelRenderer		Wheel_hub_R3;
	ModelRenderer		Wheel_hub_R4;
	ModelRenderer		Door;
	ModelRenderer		Door_Top;
	ModelRenderer		Door_Bottom;
	ModelRenderer		Door_L;
	ModelRenderer		Door_R;
	ModelRenderer		Coal;
	ModelRenderer		Front_1;
	ModelRenderer		Front_2;
	ModelRenderer		Front_3;
	
	public ModelTenderA4()
	  {
	    textureWidth = 128;
	    textureHeight = 256;
	    
	      HookF = new ModelRenderer(this, 107, 81);
	      HookF.addBox(0F, 0F, 0F, 0, 3, 3);
	      HookF.setRotationPoint(0F, 14F, 9F);
	      HookF.setTextureSize(128, 256);
	      setRotation(HookF, 0F, -3.141593F, 0F);
	      HookR = new ModelRenderer(this, 107, 81);
	      HookR.addBox(0F, 0F, 0F, 0, 3, 3);
	      HookR.setRotationPoint(0F, 14F, 39F);
	      HookR.setTextureSize(128, 256);
	      setRotation(HookR, 0F, 0F, 0F);
	      Roof = new ModelRenderer(this, 55, 212);
	      Roof.addBox(0F, 0F, 0F, 16, 0, 8);
	      Roof.setRotationPoint(-8F, 1F, 30F);
	      Roof.setTextureSize(128, 256);
	      setRotation(Roof, 0F, 0F, 0F);
	      Tender_Floor = new ModelRenderer(this, 0, 225);
	      Tender_Floor.addBox(0F, 0F, 0F, 18, 1, 30);
	      Tender_Floor.setRotationPoint(-9F, 14F, 9F);
	      Tender_Floor.setTextureSize(128, 256);
	      setRotation(Tender_Floor, 0F, 0F, 0F);
	      Tender_Frame = new ModelRenderer(this, 32, 175);
	      Tender_Frame.addBox(0F, 0F, 0F, 14, 6, 30);
	      Tender_Frame.setRotationPoint(-7F, 15F, 9F);
	      Tender_Frame.setTextureSize(128, 256);
	      setRotation(Tender_Frame, 0F, 0F, 0F);
	      TenderSideLeft = new ModelRenderer(this, 0, 181);
	      TenderSideLeft.addBox(0F, 0F, 0F, 1, 14, 30);
	      TenderSideLeft.setRotationPoint(8F, 0F, 9F);
	      TenderSideLeft.setTextureSize(128, 256);
	      setRotation(TenderSideLeft, 0F, 0F, 0F);
	      TenderSideRight = new ModelRenderer(this, 66, 211);
	      TenderSideRight.addBox(0F, 0F, 0F, 1, 14, 30);
	      TenderSideRight.setRotationPoint(-9F, 0F, 9F);
	      TenderSideRight.setTextureSize(128, 256);
	      setRotation(TenderSideRight, 0F, 0F, 0F);
	      TenderFrontPartition = new ModelRenderer(this, 0, 163);
	      TenderFrontPartition.addBox(0F, 0F, 0F, 16, 15, 1);
	      TenderFrontPartition.setRotationPoint(-8F, -1F, 12F);
	      TenderFrontPartition.setTextureSize(128, 256);
	      setRotation(TenderFrontPartition, 0F, 0F, 0F);
	      TenderCenterPartition = new ModelRenderer(this, 36, 157);
	      TenderCenterPartition.addBox(0F, 0F, 0F, 16, 15, 1);
	      TenderCenterPartition.setRotationPoint(-8F, -1F, 29F);
	      TenderCenterPartition.setTextureSize(128, 256);
	      setRotation(TenderCenterPartition, 0F, 0F, 0F);
	      TenderRearPartition = new ModelRenderer(this, 70, 157);
	      TenderRearPartition.addBox(0F, 0F, 0F, 16, 15, 1);
	      TenderRearPartition.setRotationPoint(-8F, -1F, 38F);
	      TenderRearPartition.setTextureSize(128, 256);
	      setRotation(TenderRearPartition, 0F, 0F, 0F);
	      Buffer_L = new ModelRenderer(this, 91, 82);
	      Buffer_L.addBox(0F, 0F, 0F, 3, 3, 1);
	      Buffer_L.setRotationPoint(4F, 14F, 42F);
	      Buffer_L.setTextureSize(128, 256);
	      setRotation(Buffer_L, 0F, 0F, 0F);
	      Buffer_R = new ModelRenderer(this, 91, 82);
	      Buffer_R.addBox(0F, 0F, 0F, 3, 3, 1);
	      Buffer_R.setRotationPoint(-7F, 14F, 42F);
	      Buffer_R.setTextureSize(128, 256);
	      setRotation(Buffer_R, 0F, 0F, 0F);
	      Joint_L = new ModelRenderer(this, 109, 80);
	      Joint_L.addBox(0F, 0F, 0F, 1, 1, 1);
	      Joint_L.setRotationPoint(5F, 15F, 41F);
	      Joint_L.setTextureSize(128, 256);
	      setRotation(Joint_L, 0F, 0F, 0F);
	      Joint_R = new ModelRenderer(this, 109, 80);
	      Joint_R.addBox(0F, 0F, 0F, 1, 1, 1);
	      Joint_R.setRotationPoint(-6F, 15F, 41F);
	      Joint_R.setTextureSize(128, 256);
	      setRotation(Joint_R, 0F, 0F, 0F);
	      Bumper_L = new ModelRenderer(this, 104, 73);
	      Bumper_L.addBox(-1.5F, -0.5F, 0F, 2, 2, 2);
	      Bumper_L.setRotationPoint(6F, 15F, 39F);
	      Bumper_L.setTextureSize(128, 256);
	      setRotation(Bumper_L, 0F, 0F, 0F);
	      Bumper_R = new ModelRenderer(this, 104, 73);
	      Bumper_R.addBox(-1.5F, -0.5F, 0F, 2, 2, 2);
	      Bumper_R.setRotationPoint(-5F, 15F, 39F);
	      Bumper_R.setTextureSize(128, 256);
	      setRotation(Bumper_R, 0F, 0F, 0F);
	      Angle_L = new ModelRenderer(this, 116, 73);
	      Angle_L.addBox(0F, 0F, 0F, 2, 3, 0);
	      Angle_L.setRotationPoint(7F, 15F, 39F);
	      Angle_L.setTextureSize(128, 256);
	      setRotation(Angle_L, 0F, 0F, 0F);
	      Angle_R = new ModelRenderer(this, 122, 73);
	      Angle_R.addBox(0F, 0F, 0F, 2, 3, 0);
	      Angle_R.setRotationPoint(-9F, 15F, 39F);
	      Angle_R.setTextureSize(128, 256);
	      setRotation(Angle_R, 0F, 0F, 0F);
	      CabRoof1 = new ModelRenderer(this, 0, 185);
	      CabRoof1.addBox(0F, 0F, 0F, 12, 2, 1);
	      CabRoof1.setRotationPoint(-6F, -3F, 38F);
	      CabRoof1.setTextureSize(128, 256);
	      setRotation(CabRoof1, 0F, 0F, 0F);
	      CabRoof2 = new ModelRenderer(this, 0, 146);
	      CabRoof2.addBox(-4F, 0F, 0F, 2, 1, 16);
	      CabRoof2.setRotationPoint(-6F, -3F, 13F);
	      CabRoof2.setTextureSize(128, 256);
	      setRotation(CabRoof2, 0F, 0F, -0.7853982F);
	      CabRoof3 = new ModelRenderer(this, 0, 146);
	      CabRoof3.addBox(2F, 0F, 0F, 2, 1, 16);
	      CabRoof3.setRotationPoint(6F, -3F, 13F);
	      CabRoof3.setTextureSize(128, 256);
	      setRotation(CabRoof3, 0F, 0F, 0.7853982F);
	      CabRoof4 = new ModelRenderer(this, 0, 149);
	      CabRoof4.addBox(0F, 0F, 0F, 4, 2, 1);
	      CabRoof4.setRotationPoint(6F, -3F, 38F);
	      CabRoof4.setTextureSize(128, 256);
	      setRotation(CabRoof4, 0F, 0F, 0.7853982F);
	      CabRoof5 = new ModelRenderer(this, 0, 143);
	      CabRoof5.addBox(0F, 0F, 0F, 4, 2, 1);
	      CabRoof5.setRotationPoint(6F, -3F, 12F);
	      CabRoof5.setTextureSize(128, 256);
	      setRotation(CabRoof5, 0F, 0F, 0.7853982F);
	      CabRoof6 = new ModelRenderer(this, 0, 146);
	      CabRoof6.addBox(0F, 0F, 0F, 4, 2, 1);
	      CabRoof6.setRotationPoint(6F, -3F, 29F);
	      CabRoof6.setTextureSize(128, 256);
	      setRotation(CabRoof6, 0F, 0F, 0.7853982F);
	      CabRoof7 = new ModelRenderer(this, 0, 179);
	      CabRoof7.addBox(0F, 0F, 0F, 12, 2, 1);
	      CabRoof7.setRotationPoint(-6F, -3F, 12F);
	      CabRoof7.setTextureSize(128, 256);
	      setRotation(CabRoof7, 0F, 0F, 0F);
	      CabRoof8 = new ModelRenderer(this, 0, 182);
	      CabRoof8.addBox(0F, 0F, 0F, 12, 2, 1);
	      CabRoof8.setRotationPoint(-6F, -3F, 29F);
	      CabRoof8.setTextureSize(128, 256);
	      setRotation(CabRoof8, 0F, 0F, 0F);
	      CabRoof9 = new ModelRenderer(this, 20, 143);
	      CabRoof9.addBox(-4F, 0F, 0F, 4, 2, 1);
	      CabRoof9.setRotationPoint(-6F, -3F, 12F);
	      CabRoof9.setTextureSize(128, 256);
	      setRotation(CabRoof9, 0F, 0F, -0.7853982F);
	      CabRoof10 = new ModelRenderer(this, 20, 149);
	      CabRoof10.addBox(-4F, 0F, 0F, 4, 2, 1);
	      CabRoof10.setRotationPoint(-6F, -3F, 37.999F);
	      CabRoof10.setTextureSize(128, 256);
	      setRotation(CabRoof10, 0F, 0F, -0.7853982F);
	      CabRoof11 = new ModelRenderer(this, 20, 146);
	      CabRoof11.addBox(-4F, 0F, 0F, 4, 2, 1);
	      CabRoof11.setRotationPoint(-6F, -3F, 29F);
	      CabRoof11.setTextureSize(128, 256);
	      setRotation(CabRoof11, 0F, 0F, -0.7853982F);
	      Wheels_L = new ModelRenderer(this, 66, 114);
	      Wheels_L.addBox(0F, 0F, 0F, 0, 3, 28);
	      Wheels_L.setRotationPoint(6.5F, 21F, 10F);
	      Wheels_L.setTextureSize(128, 256);
	      setRotation(Wheels_L, 0F, 0F, 0F);
	      Wheels_R = new ModelRenderer(this, 66, 114);
	      Wheels_R.addBox(0F, 0F, 0F, 0, 3, 28);
	      Wheels_R.setRotationPoint(-6.5F, 21F, 10F);
	      Wheels_R.setTextureSize(128, 256);
	      setRotation(Wheels_R, 0F, 0F, 0F);
	      Stack = new ModelRenderer(this, 0, 155);
	      Stack.addBox(0F, 0F, 0F, 4, 3, 4);
	      Stack.setRotationPoint(-2F, -2F, 32F);
	      Stack.setTextureSize(128, 256);
	      setRotation(Stack, 0F, 0F, 0F);
	      Wheel_hub_L = new ModelRenderer(this, 0, 225);
	      Wheel_hub_L.addBox(0F, 0F, 0F, 1, 4, 3);
	      Wheel_hub_L.setRotationPoint(7F, 17F, 12F);
	      Wheel_hub_L.setTextureSize(128, 256);
	      setRotation(Wheel_hub_L, 0F, 0F, 0F);
	      Wheel_hub_L2 = new ModelRenderer(this, 10, 225);
	      Wheel_hub_L2.addBox(0F, 0F, 0F, 1, 4, 3);
	      Wheel_hub_L2.setRotationPoint(7F, 17F, 19F);
	      Wheel_hub_L2.setTextureSize(128, 256);
	      setRotation(Wheel_hub_L2, 0F, 0F, 0F);
	      Wheel_hub_L3 = new ModelRenderer(this, 5, 229);
	      Wheel_hub_L3.addBox(0F, 0F, 0F, 1, 4, 3);
	      Wheel_hub_L3.setRotationPoint(7F, 17F, 26F);
	      Wheel_hub_L3.setTextureSize(128, 256);
	      setRotation(Wheel_hub_L3, 0F, 0F, 0F);
	      Wheel_hub_L4 = new ModelRenderer(this, 15, 229);
	      Wheel_hub_L4.addBox(0F, 0F, 0F, 1, 4, 3);
	      Wheel_hub_L4.setRotationPoint(7F, 17F, 33F);
	      Wheel_hub_L4.setTextureSize(128, 256);
	      setRotation(Wheel_hub_L4, 0F, 0F, 0F);
	      Wheel_hub_R = new ModelRenderer(this, 0, 233);
	      Wheel_hub_R.addBox(0F, 0F, 0F, 1, 4, 3);
	      Wheel_hub_R.setRotationPoint(-8F, 17F, 12F);
	      Wheel_hub_R.setTextureSize(128, 256);
	      setRotation(Wheel_hub_R, 0F, 0F, 0F);
	      Wheel_hub_R2 = new ModelRenderer(this, 10, 233);
	      Wheel_hub_R2.addBox(0F, 0F, 0F, 1, 4, 3);
	      Wheel_hub_R2.setRotationPoint(-8F, 17F, 19F);
	      Wheel_hub_R2.setTextureSize(128, 256);
	      setRotation(Wheel_hub_R2, 0F, 0F, 0F);
	      Wheel_hub_R3 = new ModelRenderer(this, 5, 237);
	      Wheel_hub_R3.addBox(0F, 0F, 0F, 1, 4, 3);
	      Wheel_hub_R3.setRotationPoint(-8F, 17F, 26F);
	      Wheel_hub_R3.setTextureSize(128, 256);
	      setRotation(Wheel_hub_R3, 0F, 0F, 0F);
	      Wheel_hub_R4 = new ModelRenderer(this, 15, 237);
	      Wheel_hub_R4.addBox(0F, 0F, 0F, 1, 4, 3);
	      Wheel_hub_R4.setRotationPoint(-8F, 17F, 33F);
	      Wheel_hub_R4.setTextureSize(128, 256);
	      setRotation(Wheel_hub_R4, 0F, 0F, 0F);
	      Door = new ModelRenderer(this, 110, 221);
	      Door.addBox(0F, 0F, 0F, 6, 13, 1);
	      Door.setRotationPoint(-3F, 0F, 39F);
	      Door.setTextureSize(128, 256);
	      setRotation(Door, 0F, 0F, 0F);
	      Door_Top = new ModelRenderer(this, 98, 235);
	      Door_Top.addBox(0F, 0F, 0F, 8, 1, 2);
	      Door_Top.setRotationPoint(-4F, -1F, 39F);
	      Door_Top.setTextureSize(128, 256);
	      setRotation(Door_Top, 0F, 0F, 0F);
	      Door_Bottom = new ModelRenderer(this, 98, 238);
	      Door_Bottom.addBox(0F, 0F, 0F, 8, 1, 2);
	      Door_Bottom.setRotationPoint(-4F, 13F, 39F);
	      Door_Bottom.setTextureSize(128, 256);
	      setRotation(Door_Bottom, 0F, 0F, 0F);
	      Door_L = new ModelRenderer(this, 98, 220);
	      Door_L.addBox(0F, 0F, 0F, 1, 13, 2);
	      Door_L.setRotationPoint(3F, 0F, 39F);
	      Door_L.setTextureSize(128, 256);
	      setRotation(Door_L, 0F, 0F, 0F);
	      Door_R = new ModelRenderer(this, 104, 220);
	      Door_R.addBox(0F, 0F, 0F, 1, 13, 2);
	      Door_R.setRotationPoint(-4F, 0F, 39F);
	      Door_R.setTextureSize(128, 256);
	      setRotation(Door_R, 0F, 0F, 0F);
	      Coal = new ModelRenderer(this, 30, 189);
	      Coal.addBox(0F, -0.5F, 0F, 16, 1, 16);
	      Coal.setRotationPoint(-8F, 0F, 13F);
	      Coal.setTextureSize(128, 256);
	      setRotation(Coal, 0F, 0F, 0F);
	      Front_1 = new ModelRenderer(this, 66, 145);
	      Front_1.addBox(0F, 0F, 0F, 6, 7, 1);
	      Front_1.setRotationPoint(2F, 7F, 11F);
	      Front_1.setTextureSize(128, 256);
	      setRotation(Front_1, 0F, 0F, 0F);
	      Front_2 = new ModelRenderer(this, 80, 145);
	      Front_2.addBox(0F, 0F, 0F, 3, 7, 1);
	      Front_2.setRotationPoint(-6F, 7F, 11F);
	      Front_2.setTextureSize(128, 256);
	      setRotation(Front_2, 0F, 0F, 0F);
	      Front_3 = new ModelRenderer(this, 88, 145);
	      Front_3.addBox(0F, 0F, 0F, 2, 3, 1);
	      Front_3.setRotationPoint(-8F, 11F, 11F);
	      Front_3.setTextureSize(128, 256);
	      setRotation(Front_3, 0F, 0F, 0F);
	  }
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glRotatef(180, 0, 0, 1);
		GL11.glTranslatef(0, -1.5f, -1.6f);
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		HookF.render(f5);
		HookR.render(f5);
		Roof.render(f5);
		Tender_Floor.render(f5);
		Tender_Frame.render(f5);
		TenderSideLeft.render(f5);
		TenderSideRight.render(f5);
		TenderFrontPartition.render(f5);
		TenderCenterPartition.render(f5);
		TenderRearPartition.render(f5);
		Buffer_L.render(f5);
		Buffer_R.render(f5);
		Joint_L.render(f5);
		Joint_R.render(f5);
		Bumper_L.render(f5);
		Bumper_R.render(f5);
		Angle_L.render(f5);
		Angle_R.render(f5);
		CabRoof1.render(f5);
		CabRoof2.render(f5);
		CabRoof3.render(f5);
		CabRoof4.render(f5);
		CabRoof5.render(f5);
		CabRoof6.render(f5);
		CabRoof7.render(f5);
		CabRoof8.render(f5);
		CabRoof9.render(f5);
		CabRoof10.render(f5);
		CabRoof11.render(f5);
		Wheels_L.render(f5);
		Wheels_R.render(f5);
		Stack.render(f5);
		Wheel_hub_L.render(f5);
		Wheel_hub_L2.render(f5);
		Wheel_hub_L3.render(f5);
		Wheel_hub_L4.render(f5);
		Wheel_hub_R.render(f5);
		Wheel_hub_R2.render(f5);
		Wheel_hub_R3.render(f5);
		Wheel_hub_R4.render(f5);
		Door.render(f5);
		Door_Top.render(f5);
		Door_Bottom.render(f5);
		Door_L.render(f5);
		Door_R.render(f5);
		Coal.render(f5);
		Front_1.render(f5);
		Front_2.render(f5);
		Front_3.render(f5);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}