.class public final LD/F$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LD/F$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le0/g;)Le0/j;
    .locals 2

    sget-object v0, LD/F$b$a;->D:LD/F$b$a;

    new-instance v1, LD/F$b$b;

    invoke-direct {v1, p1}, LD/F$b$b;-><init>(Le0/g;)V

    invoke-static {v0, v1}, Le0/k;->a(Lx7/p;Lx7/l;)Le0/j;

    move-result-object p1

    return-object p1
.end method
