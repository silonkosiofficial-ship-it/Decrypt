.class public final Lg7/b$b;
.super Lg7/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Lg7/a;)V
    .locals 8

    const-string v0, "reason"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo9/a;

    invoke-direct {v0}, Lo9/a;-><init>()V

    invoke-virtual {p1}, Lg7/a;->a()S

    move-result v1

    invoke-interface {v0, v1}, Lo9/p;->F(S)V

    invoke-virtual {p1}, Lg7/a;->c()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v7}, Ld7/e;->f(Lo9/p;Ljava/lang/CharSequence;IILjava/nio/charset/Charset;ILjava/lang/Object;)V

    invoke-direct {p0, v0}, Lg7/b$b;-><init>(Lo9/q;)V

    return-void
.end method

.method public constructor <init>(Lo9/q;)V
    .locals 1

    const-string v0, "packet"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lo9/r;->a(Lo9/q;)[B

    move-result-object p1

    invoke-direct {p0, p1}, Lg7/b$b;-><init>([B)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 10

    const-string v0, "data"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lg7/d;->J:Lg7/d;

    sget-object v5, Lg7/e;->C:Lg7/e;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v2, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-direct/range {v1 .. v9}, Lg7/b;-><init>(ZLg7/d;[BLW8/f0;ZZZLy7/k;)V

    return-void
.end method
