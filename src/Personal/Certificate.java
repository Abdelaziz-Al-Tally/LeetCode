package Personal;

import java.util.Date;

public class Certificate {
	private String name;
	private Date dateAcquired;
	private boolean expires;
	private Date validUntil;
	private String url;
	private String issuer;
	private String duration;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateAcquired() {
		return dateAcquired;
	}

	public void setDateAcquired(Date dateAcquired) {
		this.dateAcquired = dateAcquired;
	}

	public boolean isExpires() {
		return expires;
	}

	public void setExpires(boolean expires) {
		this.expires = expires;
	}

	public Date getValidUntil() {
		return validUntil;
	}

	public void setValidUntil(Date validUntil) {
		if (!this.expires) {
			return;
		}
		this.validUntil = validUntil;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Certificate{" +
				"name='" + name + '\'' +
				", dateAcquired=" + dateAcquired +
				", expires=" + expires +
				", validUntil=" + validUntil +
				", url='" + url + '\'' +
				", issuer='" + issuer + '\'' +
				", duration='" + duration + '\'' +
				'}';
	}
}
