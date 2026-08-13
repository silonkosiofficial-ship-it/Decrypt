.class public final Lw8/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lw8/f$a;

.field private static final b:Lw8/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw8/f$a;

    invoke-direct {v0}, Lw8/f$a;-><init>()V

    sput-object v0, Lw8/f$a;->a:Lw8/f$a;

    new-instance v0, Lw8/a;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lw8/a;-><init>(Ljava/util/List;)V

    sput-object v0, Lw8/f$a;->b:Lw8/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lw8/a;
    .locals 1

    sget-object v0, Lw8/f$a;->b:Lw8/a;

    return-object v0
.end method
