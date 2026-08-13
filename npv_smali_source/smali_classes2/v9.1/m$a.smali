.class public final Lv9/m$a;
.super Lv9/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv9/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lv9/m$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv9/m$a;

    invoke-direct {v0}, Lv9/m$a;-><init>()V

    sput-object v0, Lv9/m$a;->a:Lv9/m$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lv9/m;-><init>(Ly7/k;)V

    return-void
.end method
