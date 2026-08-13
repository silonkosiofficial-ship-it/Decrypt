.class public final LB8/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB8/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LB8/q$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LB8/q$a;

    invoke-direct {v0}, LB8/q$a;-><init>()V

    sput-object v0, LB8/q$a;->a:LB8/q$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
