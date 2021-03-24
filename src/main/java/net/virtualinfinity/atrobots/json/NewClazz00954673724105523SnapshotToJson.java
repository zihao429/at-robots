package net.virtualinfinity.atrobots.json;

import net.virtualinfinity.atrobots.snapshots.ArenaObjectSnapshot;

public class NewClazz00954673724105523SnapshotToJson {
	private ArenaObjectSnapshot snapshot;
	private String type;
	private boolean includeVelocity;

	public NewClazz00954673724105523SnapshotToJson(ArenaObjectSnapshot snapshot, String type, boolean includeVelocity) {
		this.snapshot = snapshot;
		this.type = type;
		this.includeVelocity = includeVelocity;
	}

	public ArenaObjectSnapshot getSnapshot() {
		return snapshot;
	}

	public void setSnapshot(ArenaObjectSnapshot snapshot) {
		this.snapshot = snapshot;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isIncludeVelocity() {
		return includeVelocity;
	}

	public void setIncludeVelocity(boolean includeVelocity) {
		this.includeVelocity = includeVelocity;
	}
}