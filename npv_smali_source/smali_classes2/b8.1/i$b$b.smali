.class public final Lb8/i$b$b;
.super Lb8/i$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb8/i$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lb8/i$b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb8/i$b$b;

    invoke-direct {v0}, Lb8/i$b$b;-><init>()V

    sput-object v0, Lb8/i$b$b;->a:Lb8/i$b$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lb8/i$b;-><init>(Ly7/k;)V

    return-void
.end method
