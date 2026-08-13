.class public final LI3/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Ljava/lang/Boolean;

.field protected b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, LI3/f;->a:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(LI3/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, LI3/f;->a:Ljava/lang/Boolean;

    invoke-static {p1}, LI3/g;->b(LI3/g;)Ljava/lang/String;

    invoke-static {p1}, LI3/g;->d(LI3/g;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, LI3/f;->a:Ljava/lang/Boolean;

    invoke-static {p1}, LI3/g;->c(LI3/g;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LI3/f;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)LI3/f;
    .locals 0

    iput-object p1, p0, LI3/f;->b:Ljava/lang/String;

    return-object p0
.end method
