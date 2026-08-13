.class public final LX7/D$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX7/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LX7/D$a;

.field private static final b:LX7/D;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LX7/D$a;

    invoke-direct {v0}, LX7/D$a;-><init>()V

    sput-object v0, LX7/D$a;->a:LX7/D$a;

    new-instance v0, LX7/E;

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, LX7/E;-><init>(Ljava/util/Map;)V

    sput-object v0, LX7/D$a;->b:LX7/D;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LX7/D;
    .locals 1

    sget-object v0, LX7/D$a;->b:LX7/D;

    return-object v0
.end method
