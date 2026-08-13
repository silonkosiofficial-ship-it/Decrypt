.class public abstract Lh2/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/x$a;,
        Lh2/x$b;,
        Lh2/x$c;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lh2/x;-><init>()V

    return-void
.end method

.method static synthetic b(Lh2/x;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 0

    const-string p1, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.PageEvent.map>"

    invoke-static {p0, p1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public a(Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lh2/x;->b(Lh2/x;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
