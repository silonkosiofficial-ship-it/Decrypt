.class public abstract Ly9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly9/i$a;
    }
.end annotation


# static fields
.field public static final Companion:Ly9/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly9/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly9/i$a;-><init>(Ly7/k;)V

    sput-object v0, Ly9/i;->Companion:Ly9/i$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Ly9/i;-><init>()V

    return-void
.end method
