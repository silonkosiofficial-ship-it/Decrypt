.class final Ly/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lu/l;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lu/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/a;->a:Ljava/lang/Object;

    iput-object p2, p0, Ly/a;->b:Lu/l;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly/a;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final b()Lu/l;
    .locals 1

    iget-object v0, p0, Ly/a;->b:Lu/l;

    return-object v0
.end method

.method public final c()Lu/l;
    .locals 1

    iget-object v0, p0, Ly/a;->b:Lu/l;

    return-object v0
.end method
