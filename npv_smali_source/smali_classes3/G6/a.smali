.class public final LG6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF6/k;


# static fields
.field public static final a:LG6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LG6/a;

    invoke-direct {v0}, LG6/a;-><init>()V

    sput-object v0, LG6/a;->a:LG6/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lx7/l;)LF6/b;
    .locals 2

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LG6/h;

    new-instance v1, LG6/d;

    invoke-direct {v1}, LG6/d;-><init>()V

    invoke-interface {p1, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v0, v1}, LG6/h;-><init>(LG6/d;)V

    return-object v0
.end method
