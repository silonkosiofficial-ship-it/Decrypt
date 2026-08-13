.class public final Li7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lx7/q;


# direct methods
.method public constructor <init>(Lx7/q;)V
    .locals 1

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li7/a;->a:Lx7/q;

    return-void
.end method


# virtual methods
.method public final a()Lx7/q;
    .locals 1

    iget-object v0, p0, Li7/a;->a:Lx7/q;

    return-object v0
.end method
