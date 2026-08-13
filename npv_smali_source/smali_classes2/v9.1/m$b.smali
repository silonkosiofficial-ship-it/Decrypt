.class public final Lv9/m$b;
.super Lv9/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv9/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lv9/m$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv9/m$b;

    invoke-direct {v0}, Lv9/m$b;-><init>()V

    sput-object v0, Lv9/m$b;->a:Lv9/m$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lv9/m;-><init>(Ly7/k;)V

    return-void
.end method
