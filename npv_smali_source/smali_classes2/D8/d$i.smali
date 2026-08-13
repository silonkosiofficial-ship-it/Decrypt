.class final synthetic LD8/d$i;
.super Ly7/p;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/d;-><init>(LB8/m;Li8/c;Lk8/c;Lk8/a;LO7/a0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Ly7/p;-><init>(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "<init>"

    return-object v0
.end method

.method public final k()LF7/e;
    .locals 1

    const-class v0, LD8/d$a;

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LG8/g;

    invoke-virtual {p0, p1}, LD8/d$i;->s(LG8/g;)LD8/d$a;

    move-result-object p1

    return-object p1
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    const-string v0, "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V"

    return-object v0
.end method

.method public final s(LG8/g;)LD8/d$a;
    .locals 2

    const-string v0, "p0"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LD8/d$a;

    iget-object v1, p0, Ly7/f;->D:Ljava/lang/Object;

    check-cast v1, LD8/d;

    invoke-direct {v0, v1, p1}, LD8/d$a;-><init>(LD8/d;LG8/g;)V

    return-object v0
.end method
