.class public final LV/z$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LV/z$a;

.field private static final b:LV/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV/z$a;

    invoke-direct {v0}, LV/z$a;-><init>()V

    sput-object v0, LV/z$a;->a:LV/z$a;

    invoke-static {}, Ld0/f;->a()Ld0/e;

    move-result-object v0

    sput-object v0, LV/z$a;->b:LV/z;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LV/z;
    .locals 1

    sget-object v0, LV/z$a;->b:LV/z;

    return-object v0
.end method
