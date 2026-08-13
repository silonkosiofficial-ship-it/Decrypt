.class public final LT6/G$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT6/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LT6/G$a;

.field private static final b:LT6/G;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT6/G$a;

    invoke-direct {v0}, LT6/G$a;-><init>()V

    sput-object v0, LT6/G$a;->a:LT6/G$a;

    sget-object v0, LT6/k;->c:LT6/k;

    sput-object v0, LT6/G$a;->b:LT6/G;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LT6/G;
    .locals 1

    sget-object v0, LT6/G$a;->b:LT6/G;

    return-object v0
.end method
