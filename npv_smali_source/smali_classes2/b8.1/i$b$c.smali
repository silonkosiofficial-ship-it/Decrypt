.class public final Lb8/i$b$c;
.super Lb8/i$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb8/i$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:Lb8/i$b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb8/i$b$c;

    invoke-direct {v0}, Lb8/i$b$c;-><init>()V

    sput-object v0, Lb8/i$b$c;->a:Lb8/i$b$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lb8/i$b;-><init>(Ly7/k;)V

    return-void
.end method
