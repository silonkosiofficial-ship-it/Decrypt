.class public abstract Ly9/F;
.super Ly9/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly9/F$a;
    }
.end annotation


# static fields
.field public static final Companion:Ly9/F$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly9/F$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly9/F$a;-><init>(Ly7/k;)V

    sput-object v0, Ly9/F;->Companion:Ly9/F$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly9/i;-><init>(Ly7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Ly9/F;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract d()Ljava/lang/String;
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ly9/F;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
