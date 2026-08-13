.class public final Lp9/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp9/a;
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

    invoke-direct {p0}, Lp9/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([B)Lp9/a;
    .locals 2

    const-string v0, "byteArray"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lp9/a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, v1}, Lp9/a;-><init>([BLjava/lang/Object;Ly7/k;)V

    return-object v0
.end method
