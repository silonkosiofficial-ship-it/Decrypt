.class public final Lz0/w$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz0/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lz0/w$a;

.field private static final b:Lz0/w;

.field private static final c:Lz0/w;

.field private static final d:Lz0/w;

.field private static final e:Lz0/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz0/w$a;

    invoke-direct {v0}, Lz0/w$a;-><init>()V

    sput-object v0, Lz0/w$a;->a:Lz0/w$a;

    invoke-static {}, Lz0/z;->c()Lz0/w;

    move-result-object v0

    sput-object v0, Lz0/w$a;->b:Lz0/w;

    invoke-static {}, Lz0/z;->b()Lz0/w;

    move-result-object v0

    sput-object v0, Lz0/w$a;->c:Lz0/w;

    invoke-static {}, Lz0/z;->e()Lz0/w;

    move-result-object v0

    sput-object v0, Lz0/w$a;->d:Lz0/w;

    invoke-static {}, Lz0/z;->d()Lz0/w;

    move-result-object v0

    sput-object v0, Lz0/w$a;->e:Lz0/w;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lz0/w;
    .locals 1

    sget-object v0, Lz0/w$a;->b:Lz0/w;

    return-object v0
.end method
