.class public final Lea/a;
.super Ljava/security/SecureRandom;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/security/SecureRandom;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([B)V
    .locals 1

    .prologue
    if-eqz p1, :cond_1

    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Ljava/security/SecureRandom;->nextBytes([B)V

    :cond_1
    :goto_0
    return-void
.end method
