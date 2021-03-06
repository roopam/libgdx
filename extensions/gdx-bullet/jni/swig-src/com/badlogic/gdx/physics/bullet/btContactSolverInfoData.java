/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btContactSolverInfoData extends BulletBase {
	private long swigCPtr;
	
	protected btContactSolverInfoData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btContactSolverInfoData(long cPtr, boolean cMemoryOwn) {
		this("btContactSolverInfoData", cPtr, cMemoryOwn);
		construct();
	}
	
	public static long getCPtr(btContactSolverInfoData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btContactSolverInfoData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setTau(float value) {
    gdxBulletJNI.btContactSolverInfoData_tau_set(swigCPtr, this, value);
  }

  public float getTau() {
    return gdxBulletJNI.btContactSolverInfoData_tau_get(swigCPtr, this);
  }

  public void setDamping(float value) {
    gdxBulletJNI.btContactSolverInfoData_damping_set(swigCPtr, this, value);
  }

  public float getDamping() {
    return gdxBulletJNI.btContactSolverInfoData_damping_get(swigCPtr, this);
  }

  public void setFriction(float value) {
    gdxBulletJNI.btContactSolverInfoData_friction_set(swigCPtr, this, value);
  }

  public float getFriction() {
    return gdxBulletJNI.btContactSolverInfoData_friction_get(swigCPtr, this);
  }

  public void setTimeStep(float value) {
    gdxBulletJNI.btContactSolverInfoData_timeStep_set(swigCPtr, this, value);
  }

  public float getTimeStep() {
    return gdxBulletJNI.btContactSolverInfoData_timeStep_get(swigCPtr, this);
  }

  public void setRestitution(float value) {
    gdxBulletJNI.btContactSolverInfoData_restitution_set(swigCPtr, this, value);
  }

  public float getRestitution() {
    return gdxBulletJNI.btContactSolverInfoData_restitution_get(swigCPtr, this);
  }

  public void setNumIterations(int value) {
    gdxBulletJNI.btContactSolverInfoData_numIterations_set(swigCPtr, this, value);
  }

  public int getNumIterations() {
    return gdxBulletJNI.btContactSolverInfoData_numIterations_get(swigCPtr, this);
  }

  public void setMaxErrorReduction(float value) {
    gdxBulletJNI.btContactSolverInfoData_maxErrorReduction_set(swigCPtr, this, value);
  }

  public float getMaxErrorReduction() {
    return gdxBulletJNI.btContactSolverInfoData_maxErrorReduction_get(swigCPtr, this);
  }

  public void setSor(float value) {
    gdxBulletJNI.btContactSolverInfoData_sor_set(swigCPtr, this, value);
  }

  public float getSor() {
    return gdxBulletJNI.btContactSolverInfoData_sor_get(swigCPtr, this);
  }

  public void setErp(float value) {
    gdxBulletJNI.btContactSolverInfoData_erp_set(swigCPtr, this, value);
  }

  public float getErp() {
    return gdxBulletJNI.btContactSolverInfoData_erp_get(swigCPtr, this);
  }

  public void setErp2(float value) {
    gdxBulletJNI.btContactSolverInfoData_erp2_set(swigCPtr, this, value);
  }

  public float getErp2() {
    return gdxBulletJNI.btContactSolverInfoData_erp2_get(swigCPtr, this);
  }

  public void setGlobalCfm(float value) {
    gdxBulletJNI.btContactSolverInfoData_globalCfm_set(swigCPtr, this, value);
  }

  public float getGlobalCfm() {
    return gdxBulletJNI.btContactSolverInfoData_globalCfm_get(swigCPtr, this);
  }

  public void setSplitImpulse(int value) {
    gdxBulletJNI.btContactSolverInfoData_splitImpulse_set(swigCPtr, this, value);
  }

  public int getSplitImpulse() {
    return gdxBulletJNI.btContactSolverInfoData_splitImpulse_get(swigCPtr, this);
  }

  public void setSplitImpulsePenetrationThreshold(float value) {
    gdxBulletJNI.btContactSolverInfoData_splitImpulsePenetrationThreshold_set(swigCPtr, this, value);
  }

  public float getSplitImpulsePenetrationThreshold() {
    return gdxBulletJNI.btContactSolverInfoData_splitImpulsePenetrationThreshold_get(swigCPtr, this);
  }

  public void setSplitImpulseTurnErp(float value) {
    gdxBulletJNI.btContactSolverInfoData_splitImpulseTurnErp_set(swigCPtr, this, value);
  }

  public float getSplitImpulseTurnErp() {
    return gdxBulletJNI.btContactSolverInfoData_splitImpulseTurnErp_get(swigCPtr, this);
  }

  public void setLinearSlop(float value) {
    gdxBulletJNI.btContactSolverInfoData_linearSlop_set(swigCPtr, this, value);
  }

  public float getLinearSlop() {
    return gdxBulletJNI.btContactSolverInfoData_linearSlop_get(swigCPtr, this);
  }

  public void setWarmstartingFactor(float value) {
    gdxBulletJNI.btContactSolverInfoData_warmstartingFactor_set(swigCPtr, this, value);
  }

  public float getWarmstartingFactor() {
    return gdxBulletJNI.btContactSolverInfoData_warmstartingFactor_get(swigCPtr, this);
  }

  public void setSolverMode(int value) {
    gdxBulletJNI.btContactSolverInfoData_solverMode_set(swigCPtr, this, value);
  }

  public int getSolverMode() {
    return gdxBulletJNI.btContactSolverInfoData_solverMode_get(swigCPtr, this);
  }

  public void setRestingContactRestitutionThreshold(int value) {
    gdxBulletJNI.btContactSolverInfoData_restingContactRestitutionThreshold_set(swigCPtr, this, value);
  }

  public int getRestingContactRestitutionThreshold() {
    return gdxBulletJNI.btContactSolverInfoData_restingContactRestitutionThreshold_get(swigCPtr, this);
  }

  public void setMinimumSolverBatchSize(int value) {
    gdxBulletJNI.btContactSolverInfoData_minimumSolverBatchSize_set(swigCPtr, this, value);
  }

  public int getMinimumSolverBatchSize() {
    return gdxBulletJNI.btContactSolverInfoData_minimumSolverBatchSize_get(swigCPtr, this);
  }

  public void setMaxGyroscopicForce(float value) {
    gdxBulletJNI.btContactSolverInfoData_maxGyroscopicForce_set(swigCPtr, this, value);
  }

  public float getMaxGyroscopicForce() {
    return gdxBulletJNI.btContactSolverInfoData_maxGyroscopicForce_get(swigCPtr, this);
  }

  public void setSingleAxisRollingFrictionThreshold(float value) {
    gdxBulletJNI.btContactSolverInfoData_singleAxisRollingFrictionThreshold_set(swigCPtr, this, value);
  }

  public float getSingleAxisRollingFrictionThreshold() {
    return gdxBulletJNI.btContactSolverInfoData_singleAxisRollingFrictionThreshold_get(swigCPtr, this);
  }

  public btContactSolverInfoData() {
    this(gdxBulletJNI.new_btContactSolverInfoData(), true);
  }

}
