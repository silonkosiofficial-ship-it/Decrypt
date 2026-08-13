.class public final LM8/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM8/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM8/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LM8/l$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/l$a;

    invoke-direct {v0}, LM8/l$a;-><init>()V

    sput-object v0, LM8/l$a;->a:LM8/l$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LO7/m;LO7/m;)Z
    .locals 1

    const-string v0, "what"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "from"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method
