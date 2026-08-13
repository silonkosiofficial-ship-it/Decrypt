.class public final LG8/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG8/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LG8/l$a;

.field private static final b:LG8/m;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LG8/l$a;

    invoke-direct {v0}, LG8/l$a;-><init>()V

    sput-object v0, LG8/l$a;->a:LG8/l$a;

    new-instance v0, LG8/m;

    sget-object v1, LG8/g$a;->a:LG8/g$a;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, LG8/m;-><init>(LG8/g;LG8/f;ILy7/k;)V

    sput-object v0, LG8/l$a;->b:LG8/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LG8/m;
    .locals 1

    sget-object v0, LG8/l$a;->b:LG8/m;

    return-object v0
.end method
