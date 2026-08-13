.class public abstract Ld/b$a;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Ld/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld/b$a$a;
    }
.end annotation


# direct methods
.method public static q0(Landroid/os/IBinder;)Ld/b;
    .locals 2

    .prologue
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object v0, Ld/b;->x:Ljava/lang/String;

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Ld/b;

    if-eqz v1, :cond_1

    check-cast v0, Ld/b;

    return-object v0

    :cond_1
    new-instance v0, Ld/b$a$a;

    invoke-direct {v0, p0}, Ld/b$a$a;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
