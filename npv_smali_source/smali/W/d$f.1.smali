.class public final LW/d$f;
.super LW/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# static fields
.field public static final c:LW/d$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW/d$f;

    invoke-direct {v0}, LW/d$f;-><init>()V

    sput-object v0, LW/d$f;->c:LW/d$f;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v2, v0, v1}, LW/d;-><init>(IIILy7/k;)V

    return-void
.end method


# virtual methods
.method public a(LW/e;LV/g;LV/k1;LV/Y0;)V
    .locals 0

    invoke-static {p3, p4}, LV/q;->t(LV/k1;LV/Y0;)V

    return-void
.end method
