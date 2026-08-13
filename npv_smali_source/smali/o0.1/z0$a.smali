.class public final Lo0/z0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo0/z0;
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

    invoke-direct {p0}, Lo0/z0$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Lo0/z0$a;JIILjava/lang/Object;)Lo0/z0;
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    sget-object p3, Lo0/f0;->a:Lo0/f0$a;

    invoke-virtual {p3}, Lo0/f0$a;->z()I

    move-result p3

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lo0/z0$a;->a(JI)Lo0/z0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(JI)Lo0/z0;
    .locals 2

    new-instance v0, Lo0/g0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lo0/g0;-><init>(JILy7/k;)V

    return-object v0
.end method
