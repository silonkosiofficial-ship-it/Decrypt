.class public final Ly9/A;
.super Ly9/F;
.source "SourceFile"


# static fields
.field private static final C:Ljava/lang/String;

.field public static final INSTANCE:Ly9/A;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly9/A;

    invoke-direct {v0}, Ly9/A;-><init>()V

    sput-object v0, Ly9/A;->INSTANCE:Ly9/A;

    const-string v0, "null"

    sput-object v0, Ly9/A;->C:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly9/F;-><init>(Ly7/k;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    sget-object v0, Ly9/A;->C:Ljava/lang/String;

    return-object v0
.end method

.method public final serializer()Lt9/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt9/b;"
        }
    .end annotation

    sget-object v0, Ly9/B;->a:Ly9/B;

    return-object v0
.end method
