.class public final LB8/w$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB8/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB8/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LB8/w$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LB8/w$a;

    invoke-direct {v0}, LB8/w$a;-><init>()V

    sput-object v0, LB8/w$a;->a:LB8/w$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LF8/M;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
