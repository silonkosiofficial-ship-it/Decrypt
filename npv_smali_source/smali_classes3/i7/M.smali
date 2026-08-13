.class public final Li7/M;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li7/M;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li7/M;

    invoke-direct {v0}, Li7/M;-><init>()V

    sput-object v0, Li7/M;->a:Li7/M;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "kotlin.Unit"

    return-object v0
.end method
