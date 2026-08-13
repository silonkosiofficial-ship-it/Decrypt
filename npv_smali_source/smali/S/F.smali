.class public final LS/F;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/F;

.field public static b:Lx7/q;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LS/F;

    invoke-direct {v0}, LS/F;-><init>()V

    sput-object v0, LS/F;->a:LS/F;

    const/4 v0, 0x0

    sget-object v1, LS/F$a;->D:LS/F$a;

    const v2, 0x30ccecff

    invoke-static {v2, v0, v1}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object v0

    sput-object v0, LS/F;->b:Lx7/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lx7/q;
    .locals 1

    sget-object v0, LS/F;->b:Lx7/q;

    return-object v0
.end method
