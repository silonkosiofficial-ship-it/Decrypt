.class public final Lh9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lh9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh9/a;

    invoke-direct {v0}, Lh9/a;-><init>()V

    sput-object v0, Lh9/a;->a:Lh9/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lh9/g;
    .locals 1

    sget-object v0, Lh9/g;->Companion:Lh9/g$a;

    invoke-virtual {v0}, Lh9/g$a;->f()Lh9/g;

    move-result-object v0

    return-object v0
.end method
