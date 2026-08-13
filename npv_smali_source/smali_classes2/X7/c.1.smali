.class public abstract LX7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ln8/c;

.field private static final b:Ln8/c;

.field private static final c:Ln8/c;

.field private static final d:Ln8/c;

.field private static final e:Ljava/util/List;

.field private static final f:Ljava/util/Map;

.field private static final g:Ljava/util/Map;

.field private static final h:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Ln8/c;

    const-string v1, "javax.annotation.meta.TypeQualifierNickname"

    invoke-direct {v0, v1}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v0, LX7/c;->a:Ln8/c;

    new-instance v0, Ln8/c;

    const-string v1, "javax.annotation.meta.TypeQualifier"

    invoke-direct {v0, v1}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v0, LX7/c;->b:Ln8/c;

    new-instance v0, Ln8/c;

    const-string v1, "javax.annotation.meta.TypeQualifierDefault"

    invoke-direct {v0, v1}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v0, LX7/c;->c:Ln8/c;

    new-instance v0, Ln8/c;

    const-string v1, "kotlin.annotations.jvm.UnderMigration"

    invoke-direct {v0, v1}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v0, LX7/c;->d:Ln8/c;

    sget-object v0, LX7/b;->E:LX7/b;

    const/4 v1, 0x5

    new-array v1, v1, [LX7/b;

    sget-object v2, LX7/b;->F:LX7/b;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, LX7/b;->D:LX7/b;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const/4 v2, 0x2

    aput-object v0, v1, v2

    sget-object v5, LX7/b;->H:LX7/b;

    const/4 v6, 0x3

    aput-object v5, v1, v6

    sget-object v5, LX7/b;->G:LX7/b;

    const/4 v6, 0x4

    aput-object v5, v1, v6

    invoke-static {v1}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, LX7/c;->e:Ljava/util/List;

    invoke-static {}, LX7/C;->l()Ln8/c;

    move-result-object v5

    new-instance v6, LX7/r;

    new-instance v7, Lf8/i;

    sget-object v8, Lf8/h;->E:Lf8/h;

    const/4 v9, 0x0

    invoke-direct {v7, v8, v3, v2, v9}, Lf8/i;-><init>(Lf8/h;ZILy7/k;)V

    move-object v10, v1

    check-cast v10, Ljava/util/Collection;

    invoke-direct {v6, v7, v10, v3}, LX7/r;-><init>(Lf8/i;Ljava/util/Collection;Z)V

    invoke-static {v5, v6}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v5

    invoke-static {}, LX7/C;->i()Ln8/c;

    move-result-object v6

    new-instance v7, LX7/r;

    new-instance v10, Lf8/i;

    invoke-direct {v10, v8, v3, v2, v9}, Lf8/i;-><init>(Lf8/h;ZILy7/k;)V

    check-cast v1, Ljava/util/Collection;

    invoke-direct {v7, v10, v1, v3}, LX7/r;-><init>(Lf8/i;Ljava/util/Collection;Z)V

    invoke-static {v6, v7}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v1

    new-array v6, v2, [Li7/u;

    aput-object v5, v6, v3

    aput-object v1, v6, v4

    invoke-static {v6}, Lj7/S;->k([Li7/u;)Ljava/util/Map;

    move-result-object v1

    sput-object v1, LX7/c;->f:Ljava/util/Map;

    new-instance v5, Ln8/c;

    const-string v6, "javax.annotation.ParametersAreNullableByDefault"

    invoke-direct {v5, v6}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v6, LX7/r;

    new-instance v11, Lf8/i;

    sget-object v7, Lf8/h;->D:Lf8/h;

    invoke-direct {v11, v7, v3, v2, v9}, Lf8/i;-><init>(Lf8/h;ZILy7/k;)V

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    move-object v12, v7

    check-cast v12, Ljava/util/Collection;

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    move-object v10, v6

    invoke-direct/range {v10 .. v15}, LX7/r;-><init>(Lf8/i;Ljava/util/Collection;ZILy7/k;)V

    invoke-static {v5, v6}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v5

    new-instance v6, Ln8/c;

    const-string v7, "javax.annotation.ParametersAreNonnullByDefault"

    invoke-direct {v6, v7}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v7, LX7/r;

    new-instance v11, Lf8/i;

    invoke-direct {v11, v8, v3, v2, v9}, Lf8/i;-><init>(Lf8/h;ZILy7/k;)V

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/util/Collection;

    move-object v10, v7

    invoke-direct/range {v10 .. v15}, LX7/r;-><init>(Lf8/i;Ljava/util/Collection;ZILy7/k;)V

    invoke-static {v6, v7}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    new-array v6, v2, [Li7/u;

    aput-object v5, v6, v3

    aput-object v0, v6, v4

    invoke-static {v6}, Lj7/S;->k([Li7/u;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0, v1}, Lj7/S;->n(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LX7/c;->g:Ljava/util/Map;

    invoke-static {}, LX7/C;->f()Ln8/c;

    move-result-object v0

    invoke-static {}, LX7/C;->e()Ln8/c;

    move-result-object v1

    new-array v2, v2, [Ln8/c;

    aput-object v0, v2, v3

    aput-object v1, v2, v4

    invoke-static {v2}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LX7/c;->h:Ljava/util/Set;

    return-void
.end method

.method public static final a()Ljava/util/Map;
    .locals 1

    sget-object v0, LX7/c;->g:Ljava/util/Map;

    return-object v0
.end method

.method public static final b()Ljava/util/Set;
    .locals 1

    sget-object v0, LX7/c;->h:Ljava/util/Set;

    return-object v0
.end method

.method public static final c()Ljava/util/Map;
    .locals 1

    sget-object v0, LX7/c;->f:Ljava/util/Map;

    return-object v0
.end method

.method public static final d()Ln8/c;
    .locals 1

    sget-object v0, LX7/c;->d:Ln8/c;

    return-object v0
.end method

.method public static final e()Ln8/c;
    .locals 1

    sget-object v0, LX7/c;->c:Ln8/c;

    return-object v0
.end method

.method public static final f()Ln8/c;
    .locals 1

    sget-object v0, LX7/c;->b:Ln8/c;

    return-object v0
.end method

.method public static final g()Ln8/c;
    .locals 1

    sget-object v0, LX7/c;->a:Ln8/c;

    return-object v0
.end method
