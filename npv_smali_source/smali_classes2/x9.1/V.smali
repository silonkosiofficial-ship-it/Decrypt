.class public abstract Lx9/V;
.super Lx9/C0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx9/C0;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic V(Lv9/f;I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx9/V;->a0(Lv9/f;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected abstract Y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method protected abstract Z(Lv9/f;I)Ljava/lang/String;
.end method

.method protected final a0(Lv9/f;I)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/V;->Z(Lv9/f;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx9/V;->b0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected final b0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    const-string v0, "nestedName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/C0;->U()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    invoke-virtual {p0, v0, p1}, Lx9/V;->Y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
