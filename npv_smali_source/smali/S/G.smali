.class public final LS/G;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/G;

.field public static b:Lx7/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LS/G;

    invoke-direct {v0}, LS/G;-><init>()V

    sput-object v0, LS/G;->a:LS/G;

    const/4 v0, 0x0

    sget-object v1, LS/G$a;->D:LS/G$a;

    const v2, -0x1e252514

    invoke-static {v2, v0, v1}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object v0

    sput-object v0, LS/G;->b:Lx7/p;

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

    sget-object v0, LS/G;->b:Lx7/p;

    return-object v0
.end method
