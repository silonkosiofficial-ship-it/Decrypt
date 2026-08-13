.class public final LO3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO3/a$a;,
        LO3/a$g;,
        LO3/a$f;,
        LO3/a$b;,
        LO3/a$c;,
        LO3/a$d;,
        LO3/a$e;
    }
.end annotation


# instance fields
.field private final a:LO3/a$a;

.field private final b:LO3/a$g;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;LO3/a$a;LO3/a$g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Cannot construct an Api with a null ClientBuilder"

    invoke-static {p2, v0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Cannot construct an Api with a null ClientKey"

    invoke-static {p3, v0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LO3/a;->c:Ljava/lang/String;

    iput-object p2, p0, LO3/a;->a:LO3/a$a;

    iput-object p3, p0, LO3/a;->b:LO3/a$g;

    return-void
.end method


# virtual methods
.method public final a()LO3/a$a;
    .locals 1

    iget-object v0, p0, LO3/a;->a:LO3/a$a;

    return-object v0
.end method

.method public final b()LO3/a$c;
    .locals 1

    iget-object v0, p0, LO3/a;->b:LO3/a$g;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LO3/a;->c:Ljava/lang/String;

    return-object v0
.end method
