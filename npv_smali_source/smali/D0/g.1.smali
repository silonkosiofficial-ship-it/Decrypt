.class public final LD0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD0/g;

.field public static b:Lx7/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LD0/g;

    invoke-direct {v0}, LD0/g;-><init>()V

    sput-object v0, LD0/g;->a:LD0/g;

    const/4 v0, 0x0

    sget-object v1, LD0/g$a;->D:LD0/g$a;

    const v2, -0x67cddd26

    invoke-static {v2, v0, v1}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object v0

    sput-object v0, LD0/g;->b:Lx7/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lx7/p;
    .locals 1

    sget-object v0, LD0/g;->b:Lx7/p;

    return-object v0
.end method
