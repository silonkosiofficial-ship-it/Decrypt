.class public final Lx9/b;
.super Lx9/N;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lv9/f;)V
    .locals 1

    const-string v0, "elementDesc"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lx9/N;-><init>(Lv9/f;Ly7/k;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const-string v0, "kotlin.Array"

    return-object v0
.end method
