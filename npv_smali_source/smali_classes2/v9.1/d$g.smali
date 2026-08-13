.class public final Lv9/d$g;
.super Lv9/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# static fields
.field public static final a:Lv9/d$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv9/d$g;

    invoke-direct {v0}, Lv9/d$g;-><init>()V

    sput-object v0, Lv9/d$g;->a:Lv9/d$g;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lv9/d;-><init>(Ly7/k;)V

    return-void
.end method
