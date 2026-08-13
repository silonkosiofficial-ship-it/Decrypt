.class public final Lx2/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx2/e;
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

    invoke-direct {p0}, Lx2/e$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lx2/f;)Lx2/e;
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx2/e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lx2/e;-><init>(Lx2/f;Ly7/k;)V

    return-object v0
.end method
