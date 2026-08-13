.class public final Lv9/d$i;
.super Lv9/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation


# static fields
.field public static final a:Lv9/d$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv9/d$i;

    invoke-direct {v0}, Lv9/d$i;-><init>()V

    sput-object v0, Lv9/d$i;->a:Lv9/d$i;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lv9/d;-><init>(Ly7/k;)V

    return-void
.end method
