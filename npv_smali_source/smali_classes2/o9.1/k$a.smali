.class public final Lo9/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo9/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lo9/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a()Lo9/k;
    .locals 2

    new-instance v0, Lo9/k;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo9/k;-><init>(Ly7/k;)V

    return-object v0
.end method

.method public final synthetic b([BIILo9/l;Z)Lo9/k;
    .locals 8

    const-string v0, "data"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo9/k;

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v7}, Lo9/k;-><init>([BIILo9/l;ZLy7/k;)V

    return-object v0
.end method
