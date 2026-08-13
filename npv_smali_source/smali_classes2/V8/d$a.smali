.class public final LV8/d$a;
.super LV8/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LV8/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV8/d$a;

    invoke-direct {v0}, LV8/d$a;-><init>()V

    sput-object v0, LV8/d$a;->a:LV8/d$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LV8/d;-><init>()V

    return-void
.end method
